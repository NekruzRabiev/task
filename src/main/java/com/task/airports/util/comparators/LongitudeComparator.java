package com.task.airports.util.comparators;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class LongitudeComparator implements Comparator<Airport>{

	private int compareTo(Airport o1, Airport o2) {
		return o1.getLongitude().compareTo(o2.getLongitude());
		
	}
	@Override
	public int compare(Airport o1, Airport o2) {
		
		if(compareTo(o1, o2) >= 1) {
			return 1;
		} else if (compareTo(o1, o2) <= -1) {
			return -1;
		} else {
			return 0;
		}
	}

}
