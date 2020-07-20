package com.task.airports.service;

import java.util.List;

import com.task.airports.model.Airport;

public interface AirportService {
	
	public List<Airport> findAll(); 
	
	public List<Airport> findById(String theId);
	
	public List<Airport> findByName(String name);
	
	public List<Airport> findByCity(String city);
	
	public List<Airport> findByCountry(String country);
	
	public List<Airport> findByCode(String code);
	
	public List<Airport> findByIcao(String icao);
	
	public List<Airport> findByLatitude(String latitude);
	
	public List<Airport> findByLongitude(String longitude);
	
	public List<Airport> findByAltitude(String altitude);
	
	public List<Airport> findByOffset(String offset);
	
	public List<Airport> findByDst(String dst);
	
	public List<Airport> findByTimezone(String timezone);
	
	public List<Airport> findByType(String type);
	
	public List<Airport> findBySource(String source);
}
