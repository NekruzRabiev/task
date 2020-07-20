package com.task.airports;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.jupiter.api.Test;


import com.task.airports.model.Airport;
import com.task.airports.util.AirportCsvReader;

public class AirportCsvReaderTest {
	
	@Test
	public void readCsvFile() throws FileNotFoundException {
		List<Airport> airports =  new AirportCsvReader().readCsvFile();
		airports.forEach(System.out::println);
	}

}
