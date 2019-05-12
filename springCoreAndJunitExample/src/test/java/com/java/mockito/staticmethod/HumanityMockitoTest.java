package com.java.mockito.staticmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mockito;

public class HumanityMockitoTest {
	private static final Integer BILION_TONS =5;
	private static final double GREENHOUSE_GASES_LEVEL =393.1;
	
	@Test
	public void revageAthmosphereTest(){
	HumanityMockito humanityMockito = new HumanityMockito();
	HumanityMockito humanityMockitoSpy = Mockito.spy(humanityMockito);
	Mockito.doReturn(GREENHOUSE_GASES_LEVEL).when(humanityMockitoSpy).monitorRevageOfAtAthmosphere();
	Mockito.doNothing().when(humanityMockitoSpy).releaseGreenHouseGases(BILION_TONS);
	
	// invoke testing method
    Collection<Integer> greenHouseGassesList = new ArrayList<>(
            Arrays.asList(BILION_TONS, BILION_TONS));
    double actualLevel = humanityMockitoSpy.revageAthmosphere(greenHouseGassesList);
	Assert.assertEquals(actualLevel, GREENHOUSE_GASES_LEVEL);
	}
}
