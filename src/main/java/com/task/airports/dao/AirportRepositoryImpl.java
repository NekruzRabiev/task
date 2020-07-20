package com.task.airports.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.task.airports.model.Airport;
import com.task.airports.util.AirportCsvReader;

import com.task.airports.util.comparators.AltitudeComparator;
import com.task.airports.util.comparators.CityComparator;
import com.task.airports.util.comparators.CodeComparator;
import com.task.airports.util.comparators.CountryComparator;
import com.task.airports.util.comparators.DstComparator;
import com.task.airports.util.comparators.IcaoComparator;
import com.task.airports.util.comparators.IdComparator;
import com.task.airports.util.comparators.LatitudeComparator;
import com.task.airports.util.comparators.LongitudeComparator;
import com.task.airports.util.comparators.NameComparator;
import com.task.airports.util.comparators.SourceComparator;
import com.task.airports.util.comparators.TimezoneComparator;
import com.task.airports.util.comparators.TypeComparator;

@Repository
public class AirportRepositoryImpl implements AirportRepository {
	
	private AirportCsvReader airportReader = new AirportCsvReader();
	
	private String upperFirstLetter(String keyword) {
		return keyword.substring(0, 1).toUpperCase() + keyword.substring(1);
	}
	
	@Override
	public List<Airport> findAll() {
		List<Airport> airport = new ArrayList<>(101);
		airport = airportReader.readCsvFile().subList(0, 100);
		return airport;
	}

	@Override
	public List<Airport> findById(String id) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getId().startsWith(id)) {
				airportList.add(airport);
			}
		}
		
		Collections.sort(airportList, new IdComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByName(String name) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getName().startsWith(upperFirstLetter(name))) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new NameComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByCity(String city) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getCity().startsWith(upperFirstLetter(city))) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new CityComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByCountry(String country) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getCountry().startsWith(upperFirstLetter(country))) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new CountryComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByCode(String code) {

		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getCode().startsWith(code.toUpperCase())) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new CodeComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByIcao(String icao) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getIcao().startsWith(icao.toUpperCase())) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new IcaoComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByLatitude(String latitude) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getLatitude().startsWith(latitude)) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new LatitudeComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByLongitude(String longitude) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getLongitude().startsWith(longitude)) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new LongitudeComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByAltitude(String altitude) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getAltitude().startsWith(altitude)) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new AltitudeComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByOffset(String offset) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getOffset().startsWith(offset)) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new DstComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByDst(String dst) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getDst().startsWith(upperFirstLetter(dst))) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new DstComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByTimezone(String timezone) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getTimezone().startsWith(upperFirstLetter(timezone))) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new TimezoneComparator());

		return airportList;
	}

	@Override
	public List<Airport> findByType(String type) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();
		
		String keyword = type.substring(0, 1).toLowerCase() + type.substring(1);
		
		for (Airport airport : airports) {
			if (airport.getType().startsWith(keyword)) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new TypeComparator());

		return airportList;
	}

	@Override
	public List<Airport> findBySource(String source) {
		List<Airport> airports = airportReader.readCsvFile();
		List<Airport> airportList = new ArrayList<>();

		for (Airport airport : airports) {
			if (airport.getSource().startsWith(upperFirstLetter(source))) {
				airportList.add(airport);
			}
		}

		Collections.sort(airportList, new SourceComparator());
		return airportList;
	}

}
