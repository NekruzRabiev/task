package com.task.airports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.task.airports.model.Airport;
import com.task.airports.service.AirportService;

@Controller
@RequestMapping("/airports")
public class AirportController {

	private final AirportService airportService;

	public AirportController(AirportService airportService) {
		this.airportService = airportService;
	}

	@GetMapping("/list")
	public String searchAirport(Model model) {
		List<Airport> listAirports = airportService.findAll();
		model.addAttribute("airports", listAirports);
		return "search-airports";
	}

	@GetMapping("/id")
	public String searchAirportById(@RequestParam(value = "keyword") String keyword, Model model) {

		if (keyword.matches("^\\d+$")) {
			List<Airport> listAirports = airportService.findById(keyword);
			model.addAttribute("airports", listAirports);
			return "search-airports";
		}

		return "invalid";
	}

	@GetMapping("/name")
	public String searchAirportByName(@RequestParam(value = "keyword") String keyword, Model model) {
		List<Airport> listAirports = airportService.findByName(keyword);
		model.addAttribute("airports", listAirports);
		return "search-airports";
	}

	@GetMapping("/city")
	public String searchAirportByCity(@RequestParam(value = "keyword") String keyword, Model model) {
		List<Airport> listAirports = airportService.findByCity(keyword);
		model.addAttribute("airports", listAirports);
		return "search-airports";
	}

	@GetMapping("/country")
	public String searchAirportByCountry(@RequestParam(value = "keyword") String keyword, Model model) {
		List<Airport> listAirports = airportService.findByCountry(keyword);
		model.addAttribute("airports", listAirports);
		return "search-airports";
	}

	@GetMapping("/code")
	public String searchAirportByCode(@RequestParam(value = "keyword") String keyword, Model model) {
		List<Airport> listAirports = airportService.findByCode(keyword);
		model.addAttribute("airports", listAirports);
		return "search-airports";
	}

	@GetMapping("/icao")
	public String searchAirportByIcao(@RequestParam(value = "keyword") String keyword, Model model) {
		List<Airport> listAirports = airportService.findByIcao(keyword);
		model.addAttribute("airports", listAirports);
		return "search-airports";
	}

	@GetMapping("/latitude")
	public String searchAirportByLatitude(@RequestParam(value = "keyword") String keyword, Model model) {

		if (keyword.matches("^[-]?\\d+(\\.\\d+)?$")) {
			List<Airport> listAirports = airportService.findByLatitude(keyword);
			model.addAttribute("airports", listAirports);
			return "search-airports";
		}

		return "invalid";
	}

	@GetMapping("/longitude")
	public String searchAirportByLongitude(@RequestParam(value = "keyword") String keyword, Model model) {

		if (keyword.matches("^-?\\d+(\\.\\d+)?$")) {
			List<Airport> listAirports = airportService.findByLongitude(keyword);
			model.addAttribute("airports", listAirports);
			return "search-airports";
		}

		return "invalid";
	}

	@GetMapping("/altitude")
	public String searchAirportByAltitude(@RequestParam(value = "keyword") String keyword, Model model) {

		if (keyword.matches("^[-]?\\d*$")) {
			List<Airport> listAirports = airportService.findByAltitude(keyword);
			model.addAttribute("airports", listAirports);
			return "search-airports";
		}

		return "invalid";
	}

	@GetMapping("/offset")
	public String searchAirportByOffset(@RequestParam(value = "keyword") String keyword, Model model) {

		if (keyword.matches("^[-]?\\d*$")) {
			List<Airport> listAirports = airportService.findByOffset(keyword);
			model.addAttribute("airports", listAirports);
			return "search-airports";
		}

		return "invalid";
	}

	@GetMapping("/dst")
	public String searchAirportByDst(@RequestParam(value = "keyword") String keyword, Model model) {
		List<Airport> listAirports = airportService.findByDst(keyword);
		model.addAttribute("airports", listAirports);
		return "search-airports";
	}

	@GetMapping("/timezone")
	public String searchAirportByTimezone(@RequestParam(value = "keyword") String keyword, Model model) {
		List<Airport> listAirports = airportService.findByTimezone(keyword);
		model.addAttribute("airports", listAirports);
		return "search-airports";
	}

	@GetMapping("/type")
	public String searchAirportByType(@RequestParam(value = "keyword") String keyword, Model model) {
		List<Airport> listAirports = airportService.findByType(keyword);
		model.addAttribute("airports", listAirports);
		return "search-airports";
	}

	@GetMapping("/source")
	public String searchAirportBySource(@RequestParam(value = "keyword") String keyword, Model model) {
		List<Airport> listAirports = airportService.findBySource(keyword);
		model.addAttribute("airports", listAirports);
		return "search-airports";
	}
}
