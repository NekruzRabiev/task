package com.task.airports.util.comparators;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class AltitudeComparator implements Comparator<Airport> {

	@Override
	public int compare(Airport o1, Airport o2) {

		if (o1.getAltitude().isEmpty()) {
			return 1;
		} else if (o2.getAltitude().isEmpty()) {
			return -1;
		} else {
			return Integer.valueOf(o1.getAltitude()).compareTo(Integer.valueOf(o2.getAltitude()));
		}
	}

}
