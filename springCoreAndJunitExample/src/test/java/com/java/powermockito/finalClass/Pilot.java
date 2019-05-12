package com.java.powermockito.finalClass;

public class Pilot {
	private Plane plane;
	public Pilot(Plane plane) {
		this.plane = plane;
	}
	public boolean readyForFlight(){
		plane.startEngine(plane.ENGIE_ID_RIGHT);
		plane.startEngine(plane.ENGINE_ID_LEFT);
		return plane.verifyAllSystems();	
	}
}
