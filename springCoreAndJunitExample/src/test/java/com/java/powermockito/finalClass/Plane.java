package com.java.powermockito.finalClass;

public class Plane {
	public static final int ENGIE_ID_RIGHT = 1;
	public static final int ENGINE_ID_LEFT = 2;
	public boolean verifyAllSystems(){
		throw new UnsupportedOperationException("Fail if ot Mocked");
	}
	
	public void startEngine(int engineId){
		throw new UnsupportedOperationException("Fail if not Mocked! [engineId = "+engineId+"]");
	}
}
