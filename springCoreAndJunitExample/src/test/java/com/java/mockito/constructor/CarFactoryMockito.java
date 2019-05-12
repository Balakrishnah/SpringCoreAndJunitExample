package com.java.mockito.constructor;

public class CarFactoryMockito {
	public Car CarFactoryMethod(String type, String color) {
		return new Car(type, color);
	}
	public Car constructCar(String type, String color){
		CarFactoryMethod(type, color);
		return CarFactoryMethod(type, color);
	}
}
