package com.task.airports.util.comparators;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class NameComparator implements Comparator<Airport>{

	private int compareTo(Airport o1, Airport o2) {
		return o1.getName().compareTo(o2.getName());
		
	}
	
	@Override
	public int compare(Airport o1, Airport o2) {
		
		if(o1.getName().isEmpty()) {
			return Integer.MAX_VALUE;
		} else if (o2.getName().isEmpty()) {
			return Integer.MIN_VALUE;
		} else if(compareTo(o1, o2) >= 1) {
			return 1;
		} else if (compareTo(o1, o2) <= -1) {
			return -1;
		} else {
			return 0;
		}
	}
}
