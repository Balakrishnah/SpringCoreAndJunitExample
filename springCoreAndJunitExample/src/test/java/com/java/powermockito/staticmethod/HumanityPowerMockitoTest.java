package com.java.powermockito.staticmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.java.util.Athmosphere;
@RunWith(PowerMockRunner.class)
@PrepareForTest(Athmosphere.class)
//Reference link  https://lkrnac.net/blog/tag/powermock/
public class HumanityPowerMockitoTest {
private static final int BILION_TONS=5;
private static final double GREENHOUSE_GASES_LEVEL =393.6;
@Test
public void revageAthmosphereTest() throws Exception{
	PowerMockito.spy(Athmosphere.class);	
	PowerMockito.doReturn(GREENHOUSE_GASES_LEVEL).when(Athmosphere.class, "getGreenHouseGasesLevel");
	PowerMockito.doNothing().when(Athmosphere.class, "releseGreenHouseGases", Mockito.anyInt());
	 
	// invoke testing method
    Collection<Integer> greenHouseGassesList = new ArrayList<>(Arrays.asList(BILION_TONS, BILION_TONS));
    HumanityPowerMock humanity = new HumanityPowerMock();
    double actualLevel = humanity.revageAtmosphere(greenHouseGassesList);
   
    Assert.assertEquals(actualLevel, GREENHOUSE_GASES_LEVEL);
    
}
}
