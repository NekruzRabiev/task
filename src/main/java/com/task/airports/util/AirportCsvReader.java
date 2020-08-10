package com.task.airports.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.task.airports.model.Airport;

public class AirportCsvReader {

	public List<Airport> readCsvFile() {
		Reader reader = null;

		try {
			String csvPath = Paths.get("src", "main", "resources", "airports.csv").toString();
			changeNullToString(csvPath);
			reader = Files.newBufferedReader(Paths.get(csvPath));
			ColumnPositionMappingStrategy<Airport> mappingStrategy = new ColumnPositionMappingStrategy<>();
			mappingStrategy.setType(Airport.class);
			CsvToBean<Airport> csvToBean = new CsvToBeanBuilder<Airport>(reader)
					.withType(Airport.class)
					.withMappingStrategy(mappingStrategy)
					.build();
			return csvToBean.parse();
		} catch (IOException e) {
			return null;
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private void changeNullToString(String csvPath) throws IOException {
			String datPath = Paths.get("src", "main", "resources", "airports.dat").toString();
			File file = new File(csvPath);
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			BufferedWriter bufWriter = new BufferedWriter(writer);

			String text = Files.readString(Path.of(datPath));

			if (text.contains("\\N")) {
				String result = text.replace("\\N", "\"\"");
				bufWriter.write(result);
			}

			bufWriter.flush();
			bufWriter.close();
	}
}
