package com.task.airports.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.task.airports.entity.Airport;

public interface AirportRepository extends JpaRepository<Airport, Integer> {
	public List<Airport> findTop100ByOrderByIdAsc();

	@Query("SELECT a FROM Airport a WHERE a.id LIKE :search% ORDER BY a.id ASC")
	public List<Airport> findById(@Param("search") String id);

	@Query("SELECT a FROM Airport a WHERE a.name LIKE :search% ORDER BY a.name ASC")
	public List<Airport> findByName(@Param("search") String name);

	@Query("SELECT a FROM Airport a WHERE a.city LIKE :search% ORDER BY a.city ASC")
	public List<Airport> findByCity(@Param("search") String city);

	@Query("SELECT a FROM Airport a WHERE a.country LIKE :search% ORDER BY a.country ASC")
	public List<Airport> findByCountry(@Param("search") String country);

	@Query("SELECT a FROM Airport a WHERE a.code LIKE :search% ORDER BY a.code ASC")
	public List<Airport> findByCode(@Param("search") String code);

	@Query("SELECT a FROM Airport a WHERE a.icao LIKE :search% ORDER BY a.icao ASC")
	public List<Airport> findByIcao(@Param("search") String icao);

	@Query("SELECT a FROM Airport a WHERE a.latitude LIKE :search% ORDER BY a.latitude ASC")
	public List<Airport> findByLatitude(@Param("search") String latitude);

	@Query("SELECT a FROM Airport a WHERE a.longitude LIKE :search% ORDER BY a.longitude ASC")
	public List<Airport> findByLongitude(@Param("search") String longitude);

	@Query("SELECT a FROM Airport a WHERE a.altitude LIKE :search% ORDER BY a.altitude ASC")
	public List<Airport> findByAltitude(@Param("search") String altitude);

	@Query("SELECT a FROM Airport a WHERE a.offset LIKE :search% ORDER BY a.offset ASC")
	public List<Airport> findByOffset(@Param("search") String offset);

	@Query("SELECT a FROM Airport a WHERE a.dst LIKE :search% ORDER BY a.dst ASC")
	public List<Airport> findByDst(@Param("search") String dst);

	@Query("SELECT a FROM Airport a WHERE a.timezone LIKE :search% ORDER BY a.timezone ASC")
	public List<Airport> findByTimezone(@Param("search") String timezone);

	@Query("SELECT a FROM Airport a WHERE a.type LIKE :search% ORDER BY a.type ASC")
	public List<Airport> findByType(@Param("search") String type);

	@Query("SELECT a FROM Airport a WHERE a.source LIKE :search% ORDER BY a.source ASC")
	public List<Airport> findBySource(@Param("search") String source);
}
