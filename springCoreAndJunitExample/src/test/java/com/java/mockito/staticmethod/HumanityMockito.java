package com.java.mockito.staticmethod;

import java.util.Collection;

import com.java.util.Athmosphere;



public class HumanityMockito {
	 /**
     * Is used as testing target to demostrate static mocking workaround
     * 
     * @param greenHouseGasesList
     *            list of greenhouse gases amounts to release into atmosphere
     * @return greenhouse gases levels in atmosphere
     */
	public double revageAthmosphere(Collection<Integer> greenHouseGasesList) {
		for (int greenHouseGases : greenHouseGasesList) {
			releaseGreenHouseGases(greenHouseGases);
		}
		return monitorRevageOfAtAthmosphere();
	}
	
	/**
     * Void method with default access modifier to be mocked. Wraps static
     * method call.
     * 
     * @param volume
     *            volume of greenhouse gases to release
     */
	void releaseGreenHouseGases(int volume) {
		Athmosphere.releseGreenHouseGases(volume);
	}
	
	/**
     * Method with return value and default access modifier to be mocked. Wraps
     * static method call.
     * 
     * @return greenhouse gases level
     */
	double monitorRevageOfAtAthmosphere() {
		return Athmosphere.getGreenHouseGasesLevel();
	}
}

