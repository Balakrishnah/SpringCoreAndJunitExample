package com.java.powermockito.staticmethod;

import java.util.Collection;

import com.java.util.Athmosphere;

public class HumanityPowerMock {
public double revageAtmosphere(Collection<Integer> greenHouseGasesList){
	for(int greenHouseGas:greenHouseGasesList){
		Athmosphere.releseGreenHouseGases(greenHouseGas);
	}
	return Athmosphere.getGreenHouseGasesLevel();
}
}
