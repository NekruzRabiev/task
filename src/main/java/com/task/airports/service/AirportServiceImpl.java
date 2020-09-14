package com.task.airports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.airports.dao.AirportRepository;
import com.task.airports.entity.Airport;

@Service
public class AirportServiceImpl implements AirportService {

	private AirportRepository airportRepository;

	@Autowired
	public AirportServiceImpl(AirportRepository airportRepository) {
		this.airportRepository = airportRepository;
	}
	
	@Override
	public List<Airport> findAll() {
		return airportRepository.findTop100ByOrderByIdAsc();
	}

	@Override
	public List<Airport> findById(String id) {
		return airportRepository.findById(id);
	}

	@Override
	public List<Airport> findByName(String name) {
		return airportRepository.findByName(name);
	}

	@Override
	public List<Airport> findByCity(String city) {
		return airportRepository.findByCity(city);
	}

	@Override
	public List<Airport> findByCountry(String country) {
		return airportRepository.findByCountry(country);
	}

	@Override
	public List<Airport> findByCode(String code) {
		return airportRepository.findByCode(code);
	}

	@Override
	public List<Airport> findByIcao(String icao) {
		return airportRepository.findByIcao(icao);
	}

	@Override
	public List<Airport> findByLatitude(String latitude) {
		return airportRepository.findByLatitude(latitude);
	}

	@Override
	public List<Airport> findByLongtitude(String longtitude) {
		return airportRepository.findByLongitude(longtitude);
	}

	@Override
	public List<Airport> findByAltitude(String altitude) {
		return airportRepository.findByAltitude(altitude);
	}

	@Override
	public List<Airport> findByOffset(String offset) {
		return airportRepository.findByOffset(offset);
	}

	@Override
	public List<Airport> findByDst(String dst) {
		return airportRepository.findByDst(dst);
	}

	@Override
	public List<Airport> findByTimezone(String timezone) {
		return airportRepository.findByTimezone(timezone);
	}

	@Override
	public List<Airport> findByType(String type) {
		return airportRepository.findByType(type);
	}

	@Override
	public List<Airport> findBySource(String source) {
		return airportRepository.findBySource(source);
	}
}
