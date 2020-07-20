package com.task.airports.model;

import com.opencsv.bean.CsvBindByPosition;

public class Airport {

	@CsvBindByPosition(position = 0)
	private String id;

	@CsvBindByPosition(position = 1)
	private String name;

	@CsvBindByPosition(position = 2)
	private String city;

	@CsvBindByPosition(position = 3)
	private String country;

	@CsvBindByPosition(position = 4)
	private String code;

	@CsvBindByPosition(position = 5)
	private String icao;

	@CsvBindByPosition(position = 6)
	private String latitude;

	@CsvBindByPosition(position = 7)
	private String longitude;

	@CsvBindByPosition(position = 8)
	private String altitude;

	@CsvBindByPosition(position = 9)
	private String offset;

	@CsvBindByPosition(position = 10)
	private String dst;

	@CsvBindByPosition(position = 11)
	private String timezone;

	@CsvBindByPosition(position = 12)
	private String type;

	@CsvBindByPosition(position = 13)
	private String source;

	public Airport() {

	}

	public Airport(String id, String name, String city, String country, String code, String icao, String latitude,
			String longitude, String altitude, String offset, String dst, String timezone, String type, String source) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.code = code;
		this.icao = icao;
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
		this.offset = offset;
		this.dst = dst;
		this.timezone = timezone;
		this.type = type;
		this.source = source;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getDst() {
		return dst;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", code=" + code
				+ ", icao=" + icao + ", latitude=" + latitude + ", longitude=" + longitude + ", altitude=" + altitude
				+ ", offset=" + offset + ", dst=" + dst + ", timezone=" + timezone + ", type=" + type + ", source="
				+ source + "]";
	}
	
}
