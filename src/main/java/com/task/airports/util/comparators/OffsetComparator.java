package com.task.airports.util.comparators;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class OffsetComparator implements Comparator<Airport> {

	@Override
	public int compare(Airport o1, Airport o2) {

		if (o1.getOffset().isEmpty()) {
			return 1;
		} else if (o2.getOffset().isEmpty()) {
			return -1;
		} else {
			return Float.valueOf(o1.getOffset()).compareTo(Float.valueOf(o2.getOffset()));
		}
	}
}
