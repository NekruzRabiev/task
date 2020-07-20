package com.task.airports.util.comparators;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class AltitudeComparator implements Comparator<Airport>{

	@Override
	public int compare(Airport o1, Airport o2) {
		int num1 = Integer.parseInt(o1.getAltitude());
		int num2 = Integer.parseInt(o2.getAltitude());
		
		if(num1 > num2) {
			return 1;
		} else if (num1 < num2) {
			return -1;
		} else {
			return 0;
		}
	}

}
