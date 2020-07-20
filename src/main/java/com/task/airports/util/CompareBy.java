package com.task.airports.util;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class CompareBy {

	public static final Comparator<Airport> ID = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getId, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);

	public static final Comparator<Airport> NAME = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getName, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> CITY = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getCity, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> COUNTRY = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getCountry, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> CODE = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getCode, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> ICAO = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getIcao, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> LATITUDE = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getLatitude, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> LONGITUDE = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getLongitude, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> ALTITUDE = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getAltitude, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> OFFSET = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getOffset, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> DST = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getDst, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> TIMEZONE = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getTimezone, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> TYPE = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getType, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
	
	public static final Comparator<Airport> SOURCE = 
			Comparator.nullsFirst(
					Comparator.comparing(Airport::getSource, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
}
