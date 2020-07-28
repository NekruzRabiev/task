package com.task.airports.util.comparators;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class LongitudeComparator implements Comparator<Airport>{

	@Override
	public int compare(Airport o1, Airport o2) {
		
		double num1 = Double.parseDouble(o1.getLongitude());
		double num2 = Double.parseDouble(o2.getLongitude());
		
		if(num1 > num2) {
			return 1;
		} else if (num1 < num2) {
			return -1;
		} else {
			return 0;
		}
	}

}
