package com.mission.problems.busProblem;

import java.util.Collections;
import java.util.List;

/**
 * 
 * @author a502901
 *
 */
public class Day {
	private int dayNumber;
	private int teaBreakTime;
	private List<BusPoint> busPoints;

	public Day(int dayNumber, int teaBreakTime, List<BusPoint> busPoints) {
		super();
		this.dayNumber = dayNumber;
		this.teaBreakTime = teaBreakTime;
		this.busPoints = busPoints;
	}

	public Day() {
		super();
	}

	public void lookOutForBusCount(final List<Trip> collections) {
		Collections.sort(collections);
		boolean addLastBus = false;
		for (int firstBusCounter = 0; firstBusCounter < collections.size() - 1; firstBusCounter++) {
			addLastBus = false;
			if (collections.get(firstBusCounter).getBusNo() == null) {
				collections.get(firstBusCounter).getStartPoint().setNoOfBusesToStart(
						collections.get(firstBusCounter).getStartPoint().getNoOfBusesToStart() + 1);
				collections.get(firstBusCounter).setBusNo(collections.get(firstBusCounter).getStartPoint().getName()
						+ "_" + collections.get(firstBusCounter).getStartPoint().getNoOfBusesToStart());
			}
			// System.out.println(collections.get(firstBusCounter).getStartPoint());
			for (int secondBusCounter = firstBusCounter + 1; secondBusCounter < collections
					.size(); secondBusCounter++) {
				// If time is same we can use the same bus
				if ((collections.get(firstBusCounter).getEndTime()
						+ this.getTeaBreakTime() == (collections.get(secondBusCounter).getStartTime()))) {
					collections.get(secondBusCounter).setBusNo(collections.get(firstBusCounter).getBusNo());
				} else if ((collections.get(firstBusCounter).getEndTime()
						+ this.getTeaBreakTime() < (collections.get(secondBusCounter).getStartTime()))) {
					// When end time is lower than start time it means we cannot
					// re use this bus
					addLastBus = true;
					break;
				} else {
					addLastBus = true;
				}
			}
		}
		if (addLastBus) {
			int lastBusIndex = collections.size() - 1;
			collections.get(lastBusIndex).getStartPoint()
					.setNoOfBusesToStart(collections.get(lastBusIndex).getStartPoint().getNoOfBusesToStart() + 1);
			collections.get(lastBusIndex).setBusNo(collections.get(lastBusIndex).getStartPoint().getName() + "_"
					+ collections.get(lastBusIndex).getStartPoint().getNoOfBusesToStart());
		}

	}

	public int getTeaBreakTime() {
		return teaBreakTime;
	}

	public void setTeaBreakTime(int teaBreakTime) {
		this.teaBreakTime = teaBreakTime;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

	public List<BusPoint> getBusPoints() {
		return busPoints;
	}

	public int getNoOfTotalTrips() {
		int noOfTotalTrips = 0;
		for (BusPoint busPoint : busPoints) {
			noOfTotalTrips += busPoint.getNoOfTrips();
		}
		return noOfTotalTrips;
	}

	@Override
	public String toString() {
		return "Day " + dayNumber + ":" + busPoints;
	}

	public String dayString() {
		return "Day [dayNumber=" + dayNumber + ", teaBreakTime=" + teaBreakTime + ", busPoints=" + busPoints
				+ ", noOfTotalTrips=" + this.getNoOfTotalTrips() + "]";
	}

}