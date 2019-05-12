package com.java.powermockito.privatemethod;

import java.util.Collection;

public class TruckPowerMockito {
	
	public double addLoad(Collection<Double> boxWeightsToAdd) {
		for (double boxWeightToAdd : boxWeightsToAdd) {
				addBoxToLoad(boxWeightToAdd);
		}
		return getLoadWeight();
	}

	private double getLoadWeight() {
		throw new UnsupportedOperationException("Fail if not mocked!");
	}

	private void addBoxToLoad(double weight) {
		throw new UnsupportedOperationException("Fail if not mocked!, [weight =" + weight + "]");
	}
}
