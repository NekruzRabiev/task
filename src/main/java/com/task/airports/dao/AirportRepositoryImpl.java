package com.task.airports.dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
	
	private AirportCsvReader airportReader; 
	private List<Airport> airports;
	
	public AirportRepositoryImpl() {
		airportReader = new AirportCsvReader();
		airports = airportReader.readCsvFile();
	}
	
	private String upperFirstLetter(String keyword) {
		return keyword.substring(0, 1).toUpperCase() + keyword.substring(1);
	}
	
	@Override
	public List<Airport> findAll() {
		List<Airport> airport = new ArrayList<>(100);
		airport = airports.subList(0, 100);
		return airport;
	}

	@Override
	public List<Airport> findById(String id) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getId().startsWith(id)) {
				airportList.add(airport);
			}
		}
		
		airportList.sort(new IdComparator());
		return airportList;
	}

	@Override
	public List<Airport> findByName(String name) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getName().startsWith(upperFirstLetter(name))) {
				airportList.add(airport);
			}
		}

		airportList.sort(CompareBy.NAME);
		return airportList;
	}

	@Override
	public List<Airport> findByCity(String city) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getCity().startsWith(upperFirstLetter(city))) {
				airportList.add(airport);
			}
		}

		airportList.sort(CompareBy.CITY);
		return airportList;
	}

	@Override
	public List<Airport> findByCountry(String country) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getCountry().startsWith(upperFirstLetter(country))) {
				airportList.add(airport);
			}
		}

		airportList.sort(CompareBy.COUNTRY);
		return airportList;
	}

	@Override
	public List<Airport> findByCode(String code) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getCode().startsWith(code.toUpperCase())) {
				airportList.add(airport);
			}
		}

		airportList.sort(CompareBy.CODE);
		return airportList;
	}

	@Override
	public List<Airport> findByIcao(String icao) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getIcao().startsWith(icao.toUpperCase())) {
				airportList.add(airport);
			}
		}

		airportList.sort(CompareBy.ICAO);
		return airportList;
	}

	@Override
	public List<Airport> findByLatitude(String latitude) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getLatitude().startsWith(latitude)) {
				airportList.add(airport);
			}
		}

		airportList.sort(new LatitudeComparator());
		return airportList;
	}

	@Override
	public List<Airport> findByLongitude(String longitude) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getLongitude().startsWith(longitude)) {
				airportList.add(airport);
			}
		}

		airportList.sort(new LongitudeComparator());
		return airportList;
	}

	@Override
	public List<Airport> findByAltitude(String altitude) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getAltitude().startsWith(altitude)) {
				airportList.add(airport);
			}
		}

		airportList.sort(new AltitudeComparator());
		return airportList;
	}

	@Override
	public List<Airport> findByOffset(String offset) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getOffset().startsWith(offset)) {
				airportList.add(airport);
			}
		}

		airportList.sort(new OffsetComparator());
		return airportList;
	}

	@Override
	public List<Airport> findByDst(String dst) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getDst().startsWith(upperFirstLetter(dst))) {
				airportList.add(airport);
			}
		}

		airportList.sort(CompareBy.DST);
		return airportList;
	}

	@Override
	public List<Airport> findByTimezone(String timezone) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getTimezone().startsWith(upperFirstLetter(timezone))) {
				airportList.add(airport);
			}
		}

		airportList.sort(CompareBy.TIMEZONE);
		return airportList;
	}

	@Override
	public List<Airport> findByType(String type) {
		List<Airport> airportList = new LinkedList<>();
		
		String keyword = type.substring(0, 1).toLowerCase() + type.substring(1);
		
		for (Airport airport : airports) {
			if (airport.getType().startsWith(keyword)) {
				airportList.add(airport);
			}
		}

		airportList.sort(CompareBy.TYPE);
		return airportList;
	}

	@Override
	public List<Airport> findBySource(String source) {
		List<Airport> airportList = new LinkedList<>();

		for (Airport airport : airports) {
			if (airport.getSource().startsWith(upperFirstLetter(source))) {
				airportList.add(airport);
			}
		}

		airportList.sort(CompareBy.SOURCE);
		return airportList;
	}

}
