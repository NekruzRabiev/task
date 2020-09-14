package com.task.airports.util.comparators;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class IdComparator implements Comparator<Airport> {
	
	@Override
	public int compare(Airport o1, Airport o2) {

		if (o1.getId().length() == 0) {
			return 1;
		} else if (o2.getId().length() == 0) {
			return -1;
		} else {
			return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
		}
	}
}
