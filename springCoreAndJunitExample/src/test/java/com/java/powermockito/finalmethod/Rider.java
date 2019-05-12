package com.java.powermockito.finalmethod;

public class Rider {
	private Bike bike;

	public Rider(Bike bike) {
		this.bike = bike;
	}
	
	public int prepareUpHill(){
		int gear = bike.getGear();
		for(int i=0;i<2;i++){
			bike.shiftGear(true);
			gear++;
		}
		return gear;
	}
}
