package com.mission.problems.busProblem;

/**
 * This class holds information about bus point like it's name, no of buses
 * required to start from this point and no of trips planned from this point
 * 
 * @author a502901
 *
 */
class BusPoint {
	private String name;
	private int noOfBusesToStart;
	private int noOfTrips;

	public BusPoint(String name, int noOfBusesToStart, int noOfTrips) {
		super();
		this.name = name;
		this.noOfBusesToStart = noOfBusesToStart;
		this.noOfTrips = noOfTrips;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfBusesToStart() {
		return noOfBusesToStart;
	}

	public void setNoOfBusesToStart(int noOfBusesToStart) {
		this.noOfBusesToStart = noOfBusesToStart;
	}

	public int getNoOfTrips() {
		return noOfTrips;
	}

	public void setNoOfTrips(int noOfTrips) {
		this.noOfTrips = noOfTrips;
	}

	@Override
	public String toString() {
		return  noOfBusesToStart + " ";
	}

	public String busPointString() {
		return "BusPoint [name=" + name + ", noOfBusesToStart=" + noOfBusesToStart + ", noOfTrips=" + getNoOfTrips()
				+ "]";
	}
}
