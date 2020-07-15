package com.task.airports.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airports")
public class Airport {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private String id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "icao")
	private String icao;
	
	@Column(name = "latitude")
	private String latitude;

	@Column(name = "longtitude")
	private String longtitude;
	
	@Column(name = "altitude")
	private String altitude;
	
	@Column(name = "offset")
	private String offset;
	
	@Column(name = "dst")
	private String dst;
	
	@Column(name = "timezone")
	private String timezone;
	
	@Column(name = "type")
	private String type;

	@Column(name = "source")
	private String source;
	
	public Airport() {
	
	}

	public Airport(String id, String name, String city, String country, String code, String icao, String latitude,
			String longtitude, String altitude, String offset, String dst, String timezone, String type,
			String source) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.code = code;
		this.icao = icao;
		this.latitude = latitude;
		this.longtitude = longtitude;
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

	public String getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
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

}
