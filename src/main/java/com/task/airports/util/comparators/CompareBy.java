package com.task.airports.util.comparators;

import java.util.Comparator;
import java.util.function.Function;

import com.task.airports.model.Airport;

public class CompareBy {
	
	public static Comparator<Airport> findProperty(Function<Airport, String> property) {
		return Comparator.nullsFirst(
					Comparator.comparing(property, Comparator.nullsFirst(
							Comparator.naturalOrder())
							)
					);
		}
	
}
