package com.task.airports.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.task.airports.model.Airport;

@Component
public class AirportCsvReader implements CsvReader {

	public AirportCsvReader() {

	}

	@Override
	public List<Airport> readCsvFile() {
		Reader reader = null;
		final String CSVFILE = "airports.csv";

		try {
			changeNullToString(CSVFILE);
			reader = Files.newBufferedReader(Paths.get(CSVFILE), StandardCharsets.UTF_8);
			ColumnPositionMappingStrategy<Airport> mappingStrategy = new ColumnPositionMappingStrategy<>();
			mappingStrategy.setType(Airport.class);
			CsvToBean<Airport> csvToBean = new CsvToBeanBuilder<Airport>(reader).withType(Airport.class)
					.withMappingStrategy(mappingStrategy).build();
			return csvToBean.parse();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void changeNullToString(final String CSVFILE) {
		BufferedWriter bufWriter = null;
		InputStream in = null;
		Scanner sc = null;

		try {
			FileWriter writer = new FileWriter(CSVFILE, StandardCharsets.UTF_8);
			bufWriter = new BufferedWriter(writer);

			in = this.getClass().getResourceAsStream("/airports.dat");
			sc = new Scanner(in, StandardCharsets.UTF_8);

			while (sc.hasNextLine()) {
				String line = sc.nextLine();

				if (line.contains("\\N")) {
					line = line.replace("\\N", "\"\"");
					bufWriter.write(line + "\n");
				} else {
					bufWriter.write(line + "\n");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				bufWriter.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
