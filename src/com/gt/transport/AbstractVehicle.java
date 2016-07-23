package com.gt.transport;

public class AbstractVehicle implements Vehicle {

	int speed;
	int timeToCrossAcrater;
	WEATHER supportedWeathers[];

	AbstractVehicle(int speed, int timeToCrossAcrater,
			WEATHER supportedWeathers[]) {
		this.speed = speed;
		this.timeToCrossAcrater = timeToCrossAcrater;
		this.supportedWeathers = supportedWeathers;
	}

	private boolean isSupportedWeather(WEATHER w) {
		for (WEATHER weather : supportedWeathers) {
			if (weather == w) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int findCost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
