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

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.task.airports.model.Airport;

import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

@Component
public class AirportCsvReader implements CsvReader{
	
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
			CsvToBean<Airport> csvToBean = new CsvToBeanBuilder<Airport>(reader)
					.withType(Airport.class)
					.withMappingStrategy(mappingStrategy)
					.build();
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

		try {
			FileWriter writer = new FileWriter(CSVFILE, StandardCharsets.UTF_8);
			bufWriter = new BufferedWriter(writer);
			
			in = this.getClass().getResourceAsStream("/airports.dat");
			String text = StreamUtils.copyToString(in, StandardCharsets.UTF_8);	
			
			if (text.contains("\\N")) {
				String result = text.replace("\\N", "\"\"");
				bufWriter.write(result);
			} else {
				bufWriter.write(text);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				bufWriter.flush();
				bufWriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
