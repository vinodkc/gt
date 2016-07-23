package com.gt.transport;

public class Result {
	private Vehicle vehicle;
	private Orbit orbit;
	private int timeMinutes;

	public Result(Vehicle vehicle, Orbit orbit, int timeMinutes) {
		this.vehicle = vehicle;
		this.orbit = orbit;
		this.timeMinutes = timeMinutes;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setOrbit(Orbit orbit) {
		this.orbit = orbit;
	}

	public void setTimeMinutes(int timeMinutes) {
		this.timeMinutes = timeMinutes;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public Orbit getOrbit() {
		return orbit;
	}

	public int getTimeMinutes() {
		return timeMinutes;
	}

}
