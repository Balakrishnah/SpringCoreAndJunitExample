package com.java.powermockito.finalClass;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Plane.class)
public class PilotPowerMockitoTest {
	@Test
	public void readyForFlightTest(){
		Plane planeMock=PowerMockito.mock(Plane.class);
		Pilot pilot = new Pilot(planeMock);
		Mockito.when(planeMock.verifyAllSystems()).thenReturn(true);
		boolean actulStatus=pilot.readyForFlight();
		Assert.assertEquals(actulStatus, true);
		Mockito.verify(planeMock).startEngine(Plane.ENGINE_ID_LEFT);
		Mockito.verify(planeMock).startEngine(Plane.ENGIE_ID_RIGHT);
	}
}
