package com.carshowroom;

public class Car {
	
	private String carname;
	
	private long carprice;

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public long getCarprice() {
		return carprice;
	}

	public Car() {
		super();
	}

	public Car(String carname, long carprice) {
		super();
		this.carname = carname;
		this.carprice = carprice;
	}

	@Override
	public String toString() {
		return "Car [carname=" + carname + ", carprice=" + carprice + "]";
	}

	public void setCarprice(long carprice) {
		this.carprice = carprice;
	}
}
