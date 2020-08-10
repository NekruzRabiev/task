package com.task.airports.dao;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

import org.springframework.stereotype.Repository;

import com.task.airports.model.Airport;
import com.task.airports.util.AirportCsvReader;
import com.task.airports.util.comparators.AltitudeComparator;
import com.task.airports.util.comparators.CompareBy;
import com.task.airports.util.comparators.IdComparator;
import com.task.airports.util.comparators.LatitudeComparator;
import com.task.airports.util.comparators.LongitudeComparator;
import com.task.airports.util.comparators.OffsetComparator;

@Repository
public class AirportRepositoryImpl implements AirportRepository {

	private AirportCsvReader airportReader = new AirportCsvReader();
	private List<Airport> airports = airportReader.readCsvFile();

	private List<Airport> find(String keyword, Comparator<Airport> comparator, Function<Airport, String> func) {
		List<Airport> airportList = new LinkedList<>();
		Airport airport = new Airport();
		String methodsResult;

		for (Iterator<Airport> iter = airports.iterator(); iter.hasNext();) {
			airport = iter.next();
			methodsResult = func.apply(airport);

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

	@Override
	public List<Airport> findAll() {
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
		return find(name, CompareBy.NAME, Airport::getName);
	}

	@Override
	public List<Airport> findByCity(String city) {
		return find(city, CompareBy.CITY, Airport::getCity);
	}

	@Override
	public List<Airport> findByCountry(String country) {
		return find(country, CompareBy.COUNTRY, Airport::getCountry);
	}

	@Override
	public List<Airport> findByCode(String code) {
		return find(code, CompareBy.CODE, Airport::getCode);
	}

	@Override
	public List<Airport> findByIcao(String icao) {
		return find(icao, CompareBy.ICAO, Airport::getIcao);
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
		return find(dst, CompareBy.DST, Airport::getDst);
	}

	@Override
	public List<Airport> findByTimezone(String timezone) {
		return find(timezone, CompareBy.TIMEZONE, Airport::getTimezone);
	}

	@Override
	public List<Airport> findByType(String type) {
		return find(type, CompareBy.TYPE, Airport::getType);
	}

	@Override
	public List<Airport> findBySource(String source) {
		return find(source, CompareBy.SOURCE, Airport::getSource);
	}
}