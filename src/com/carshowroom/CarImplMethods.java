package com.carshowroom;

import java.util.ArrayList;

import java.util.Scanner;

public class CarImplMethods {

	ArrayList<Car> carlist = new ArrayList<Car>();

	Scanner sc = new Scanner(System.in);

	public void addCars() {
		int i;

		System.out.println("Enter no of cars you want to add:");

		int n = sc.nextInt();

		for (i = 0; i < n; i++) {

			System.out.println("Enter Car Name:");

			String carname = sc.next();

			System.out.println("Enter Car Price:");

			long carprice = sc.nextLong();

			carlist.add(new Car(carname, carprice));
		}

	}

	public void showCars() {
		if (carlist.isEmpty()) {
			System.out.println("No Cars are there...Please add Cars...");
		} else {
			for (Car c : carlist) {
				System.out.println("Car Name: " + c.getCarname() + "  " + "Car Price: " + c.getCarprice());
			}
		}
	}

	public void deleteCar() {

		if (carlist.isEmpty()) {
			System.out.println("No Cars are there to Delete...Please add Cars...");
		} else {
			System.out.println("Enter Car Name you want to delete:");

			String carname = sc.next();

			for (@SuppressWarnings("unused") Car c : carlist) {
				carlist.removeIf(car_name -> car_name.getCarname().equalsIgnoreCase(carname));

				System.out.println("" + carname + "Deleted from Cars List....");
			}
		}
	}

	public void updateCar() {

		if (carlist.isEmpty()) {
			System.out.println("No Cars are there to Update...Please add Cars...");
		} else {
			System.out.println("Enter Car Name you want to update:");

			String carname = sc.next();

			for (Car c : carlist) {
				if (c.getCarname().equalsIgnoreCase(carname)) {
					System.out.println("Enter car name that you want to set for" + carname + ": ");

					String set_car_name = sc.next();

					c.setCarname(set_car_name);

					break;
				}
			}
		}
	}

	public void searchCar() {

		if (carlist.isEmpty()) {
			System.out.println("No Cars are there to search...Please add Cars...");
		} else {
			System.out.println("Enter Car Name you want to search:");
			String name = sc.next();
			boolean found = false;
			for (Car c : carlist) {
				if (c.getCarname().equalsIgnoreCase(name)) {
					System.out.println("Car Name: " + c.getCarname() + "  " + "Car Price: " + c.getCarprice());
					found = true;
				} else {
					found = false;
				}
			}
			if (!found) {
				System.out.println("Car name Not Found...");
			}
		}
	}
}
