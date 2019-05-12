package com.java.powermockito.finalmethod;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Bike.class)
public class RiderPowerMockitoTest {
	private static final int TESTING_INITIAL_GEAR = 2;	
	@Test
	public void prepareUpHillTest() {
		Bike mock = PowerMockito.mock(Bike.class);
		Rider rider = new Rider(mock);
		Mockito.when(mock.getGear()).thenReturn(TESTING_INITIAL_GEAR);
		int actual = rider.prepareUpHill();
		Assert.assertEquals(actual, TESTING_INITIAL_GEAR + 2);
		Mockito.verify(mock,Mockito.times(2)).shiftGear(true);
	}
}
