package com.java.mockito.privatemethod;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mockito;

public class TrainMockitoTest {
	private static final int TEST_WAGON_COUNT=2;
	@Test
	public void composeTest(){
	TrainMockito mockito = new TrainMockito();
	 TrainMockito trainMockitoSpy=Mockito.spy(mockito);
	 Mockito.doReturn(TEST_WAGON_COUNT).when(trainMockitoSpy).getWagonsCount();
	 Mockito.doNothing().when(trainMockitoSpy).addWagon(0);
	 
	 int actualWagonCount=trainMockitoSpy.compose();
	 Assert.assertEquals(actualWagonCount, TEST_WAGON_COUNT);
	 Mockito.verify(trainMockitoSpy,Mockito.times(TEST_WAGON_COUNT)).addWagon(0);
	}
}
