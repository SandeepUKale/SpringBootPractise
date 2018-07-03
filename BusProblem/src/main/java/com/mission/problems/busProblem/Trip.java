package com.mission.problems.busProblem;

/**
 * This is the Entity of
 * 
 * @author a502901
 *
 */
class Trip implements Comparable<Trip> {
	private Integer startTime, endTime;
	private String busNo;
	private BusPoint startPoint, endPoint;

	public Trip(int start, int end, BusPoint startPoint, BusPoint endPoint) {
		this.startTime = start;
		this.endTime = end;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	@Override
	public int compareTo(Trip o) {
		return this.startTime.compareTo(o.startTime);
	}

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public BusPoint getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(BusPoint startPoint) {
		this.startPoint = startPoint;
	}

	public BusPoint getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(BusPoint endPoint) {
		this.endPoint = endPoint;
	}

	@Override
	public String toString() {
		return "Trip [startTime=" + startTime + ", endTime=" + endTime + ", busNo=" + busNo + ", startPoint="
				+ startPoint + ", endPoint=" + endPoint + "]";
	}
}