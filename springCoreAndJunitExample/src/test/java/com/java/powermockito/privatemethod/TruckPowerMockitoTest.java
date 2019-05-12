package com.java.powermockito.privatemethod;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(TruckPowerMockito.class)
public class TruckPowerMockitoTest {
	private static final double TESTING_LOAD_WEIGHT = 200;
	private static final double TESTING_BOX_WEIGHT = 100;
	@Test
	public void addLoadTest() throws Exception {
		TruckPowerMockito truck = new TruckPowerMockito();
		TruckPowerMockito truckPowerMockitoSpy = PowerMockito.spy(truck);
		PowerMockito.doReturn(TESTING_LOAD_WEIGHT).when(truckPowerMockitoSpy,"getLoadWeight");
		PowerMockito.doNothing().when(truckPowerMockitoSpy, "addBoxToLoad",Mockito.anyDouble());
		
		Collection<Double> boxWeights = Arrays.asList(TESTING_BOX_WEIGHT,
				TESTING_LOAD_WEIGHT);
		double actualLoad = truckPowerMockitoSpy.addLoad(boxWeights);

		Assert.assertEquals(actualLoad, TESTING_LOAD_WEIGHT);
		PowerMockito.verifyPrivate(truckPowerMockitoSpy, Mockito.times(1)).invoke("addBoxToLoad", TESTING_BOX_WEIGHT);
	}
}
