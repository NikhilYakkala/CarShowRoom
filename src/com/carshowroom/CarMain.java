package com.carshowroom;
import java.util.*;
public class CarMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s;
		CarImplMethods cim = new CarImplMethods();
		do
		{
			System.out.println("Welcome to Car Show Room....How can I Help You");
			System.out.println("1.Add New Cars" + "\n" + "2.Show List of Cars" + "\n" + "3.Delete Car" + "\n"
					+ "4.Update Car" + "\n" + "5.Search Car" + "\n" + "6.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				cim.addCars();
				break;
			case 2:
				cim.showCars();
				break;
			case 3:
				cim.deleteCar();
				break;
			case 4:
				cim.updateCar();
				break;
			case 5:
				cim.searchCar();
				break;
			case 6:
				break;
			default:
				System.out.println("Invalid Choice...");
				break;
			}
			System.out.println("Do You wish to Continue");
			s = sc.next();
		} while (s.equalsIgnoreCase("Y"));
	}
}