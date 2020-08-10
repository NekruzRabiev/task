package com.task.airports.util.comparators;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class LongitudeComparator implements Comparator<Airport> {

	@Override
	public int compare(Airport o1, Airport o2) {

		if (o1.getLongitude().isEmpty()) {
			return 1;
		} else if (o2.getLongitude().isEmpty()) {
			return -1;
		} else {
			return Double.valueOf(o1.getLongitude()).compareTo(Double.valueOf(o2.getLongitude()));
		}
	}

}
