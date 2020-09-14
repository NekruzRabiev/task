package com.task.airports.util.comparators;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class LatitudeComparator implements Comparator<Airport> {

	@Override
	public int compare(Airport o1, Airport o2) {

		if (o1.getLatitude().length() == 0) {
			return 1;
		} else if (o2.getLatitude().length() == 0) {
			return -1;
		} else {
			return Double.valueOf(o1.getLatitude()).compareTo(Double.valueOf(o2.getLatitude()));
		}
	}
}
