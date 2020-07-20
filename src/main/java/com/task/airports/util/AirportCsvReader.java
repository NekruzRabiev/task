package com.task.airports.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.task.airports.model.Airport;

public class AirportCsvReader {

	public List<Airport> readCsvFile() {
		FileReader reader = null;
		try {
			reader = new FileReader("src/main/resources/airports.csv");
			ColumnPositionMappingStrategy<Airport> mappingStrategy = new ColumnPositionMappingStrategy<>();
			mappingStrategy.setType(Airport.class);
			CsvToBean<Airport> csvToBean = new CsvToBeanBuilder<Airport>(reader).withType(Airport.class)
					.withMappingStrategy(mappingStrategy).build();
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

}
