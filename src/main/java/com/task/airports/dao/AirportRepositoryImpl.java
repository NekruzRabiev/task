package com.task.airports.dao;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.task.airports.model.Airport;
import com.task.airports.util.CsvReader;
import com.task.airports.util.comparators.AltitudeComparator;
import com.task.airports.util.comparators.CompareBy;
import com.task.airports.util.comparators.IdComparator;
import com.task.airports.util.comparators.LatitudeComparator;
import com.task.airports.util.comparators.LongitudeComparator;
import com.task.airports.util.comparators.OffsetComparator;

@Repository
public class AirportRepositoryImpl implements AirportRepository {
	
	private CsvReader airportReader;
	private List<Airport> airports;
	
	@Autowired
	public AirportRepositoryImpl(CsvReader csvReader) {
		this.airportReader = csvReader;
	}

	@Override
	public List<Airport> findAll() {
		airports = airportReader.readCsvFile();
		
		if (airports.size() <= 100) {
			return airports;
		} else {
			return airports.subList(0, 100);
		}
	}

	@Override
	public List<Airport> findById(String id) {
		return find(id, new IdComparator(), Airport::getId);
	}

	@Override
	public List<Airport> findByName(String name) {
		return find(name, CompareBy.findProperty(Airport::getName), Airport::getName);
	}

	@Override
	public List<Airport> findByCity(String city) {
		return find(city, CompareBy.findProperty(Airport::getCity), Airport::getCity);
	}

	@Override
	public List<Airport> findByCountry(String country) {
		return find(country, CompareBy.findProperty(Airport::getCountry), Airport::getCountry);
	}

	@Override
	public List<Airport> findByCode(String code) {
		return find(code, CompareBy.findProperty(Airport::getCode), Airport::getCode);
	}

	@Override
	public List<Airport> findByIcao(String icao) {
		return find(icao, CompareBy.findProperty(Airport::getIcao), Airport::getIcao);
	}

	@Override
	public List<Airport> findByLatitude(String latitude) {
		return find(latitude, new LatitudeComparator(), Airport::getLatitude);
	}

	@Override
	public List<Airport> findByLongitude(String longitude) {
		return find(longitude, new LongitudeComparator(), Airport::getLongitude);
	}

	@Override
	public List<Airport> findByAltitude(String altitude) {
		return find(altitude, new AltitudeComparator(), Airport::getAltitude);
	}

	@Override
	public List<Airport> findByOffset(String offset) {
		return find(offset, new OffsetComparator(), Airport::getOffset);
	}

	@Override
	public List<Airport> findByDst(String dst) {
		return find(dst, CompareBy.findProperty(Airport::getDst), Airport::getDst);
	}

	@Override
	public List<Airport> findByTimezone(String timezone) {
		return find(timezone, CompareBy.findProperty(Airport::getTimezone), Airport::getTimezone);
	}

	@Override
	public List<Airport> findByType(String type) {
		return find(type, CompareBy.findProperty(Airport::getType), Airport::getType);
	}

	@Override
	public List<Airport> findBySource(String source) {
		return find(source, CompareBy.findProperty(Airport::getSource), Airport::getSource);
	}
	
	private List<Airport> find(String keyword, Comparator<Airport> comparator, Function<Airport, String> property) {
		List<Airport> airportList = new LinkedList<>();
		Airport airport = new Airport();
		String methodsResult;

		for (Iterator<Airport> iter = airports.iterator(); iter.hasNext();) {
			airport = iter.next();
			methodsResult = property.apply(airport);

			if (!(keyword.isEmpty()) && methodsResult.toLowerCase().startsWith(keyword.toLowerCase())) {
				airportList.add(airport);
			} else if (keyword.isEmpty() && methodsResult.isEmpty()) {
				airportList.add(airport);
			}
		}

		// List<Airport> airportArray = new ArrayList<>(airportList);
		airportList.sort(comparator);
		return airportList;
	}
}