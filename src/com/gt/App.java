package com.gt;

import java.util.Scanner;

import com.gt.transport.Bike;
import com.gt.transport.Location;
import com.gt.transport.Orbit;
import com.gt.transport.Result;
import com.gt.transport.SuperCar;
import com.gt.transport.Traffic;
import com.gt.transport.TukTuk;
import com.gt.transport.Vehicle;
import com.gt.transport.Vehicle.WEATHER;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the weather");
		String weatherStr = scanner.nextLine();

		WEATHER weather = WEATHER.valueOf(weatherStr.toUpperCase());

		System.out.println("Enter Orbit1 traffic speed in mm/hr : ");
		int orbit1MaxTrafficSpeed = Integer.parseInt(scanner.nextLine());

		System.out.println("Enter Orbit2 traffic speed in mm/hr : ");
		int orbit2MaxTrafficSpeed = Integer.parseInt(scanner.nextLine());

		Location l1 = new Location("Silk Dorb");
		Location l2 = new Location("Hallitharam");

		Orbit orbits[] = new Orbit[] {
				new Orbit("Orbit1", 18, 20, l1, l2, orbit1MaxTrafficSpeed),
				new Orbit("Orbit2", 20, 10, l1, l2, orbit2MaxTrafficSpeed) };

		Traffic traffic = new Traffic(orbits);

		Result result = traffic.findShortestPath(new Vehicle[] { new Bike(),
				new SuperCar(), new TukTuk() }, weather);
		System.out.println("Vehicle " + result.getVehicle() + " on "
				+ result.getOrbit() );

	}

}
