package com.gt.transport;

public class Orbit {
	private String name;
	private int distance;
	private int craterCount;
	private Location source;
	private Location destination;
	private int maxAllowedSpeed;
	
	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return  name;
	}

	public int getCraterCount() {
		return craterCount;
	}

	public int getMaxAllowedSpeed() {
		return maxAllowedSpeed;
	}


	public Orbit(String name, int distance, int craterCount, Location source,
			Location destination, int maxAllowedSpeed) {
		this.name = name;
		this.distance = distance;
		this.craterCount = craterCount;
		this.source = source;
		this.destination = destination;
		this.maxAllowedSpeed = maxAllowedSpeed;

	}

}
