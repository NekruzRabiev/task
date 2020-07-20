package com.task.airports.util.comparators;

import java.util.Comparator;

import com.task.airports.model.Airport;

public class OffsetComparator implements Comparator<Airport>{

	@Override
	public int compare(Airport o1, Airport o2) {
		float num1 = Float.parseFloat(o1.getOffset());
		float num2 = Float.parseFloat(o2.getOffset());
		
		if(num1 > num2) {
			return 1;
		} else if (num1 < num2) {
			return -1;
		} else {
			return 0;
		}
	}

}
