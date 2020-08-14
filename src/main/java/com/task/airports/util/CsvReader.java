package com.task.airports.util;

import java.util.List;

import com.task.airports.model.Airport;

public interface CsvReader {
	public List<Airport> readCsvFile();
}
