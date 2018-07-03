package com.mission.problems.busProblem;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		String fileName = "C:/sandeep/Planner/BusProblem/src/main/resources/input_full.txt";

		try (Scanner scanner = new Scanner(new File(fileName))) {

			int noOfDays = Integer.parseInt(scanner.nextLine());
			int dayCounter = 0;
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				if (line == null || line.isEmpty()) {
					continue;
				}
				int teaBreakTime = Integer.parseInt(line);

				String[] busArray = scanner.nextLine().split("\\s+");
				int busStartingA = Integer.parseInt(busArray[0]);
				int busStartingB = Integer.parseInt(busArray[1]);

				BusPoint aBusPoint = new BusPoint("A", 0, busStartingA);
				BusPoint bBusPoint = new BusPoint("B", 0, busStartingB);
				List<BusPoint> busPoints = new ArrayList<>();
				busPoints.add(aBusPoint);
				busPoints.add(bBusPoint);

				Day day = new Day(++dayCounter, teaBreakTime, busPoints);
				List<Trip> collections = new ArrayList<>();
				int busPointCounter = 0, busPointTrips = 0;
				BusPoint currentBusPoint = busPoints.get(busPointCounter);
				int noOfTotalTrips = day.getNoOfTotalTrips();

				for (int rowCounter = 0; rowCounter < noOfTotalTrips; rowCounter++) {
					String[] schedule = scanner.nextLine().split("\\s+");
					int[] scheduleTimings = { Integer.parseInt(schedule[0].replace(":", "")),
							Integer.parseInt(schedule[1].replace(":", "")) };
					if (currentBusPoint.getNoOfTrips() + busPointTrips == rowCounter) {
						busPointTrips += currentBusPoint.getNoOfTrips();
						currentBusPoint = busPoints.get(++busPointCounter);
					}
					collections.add(new Trip(scheduleTimings[0], scheduleTimings[1], currentBusPoint,
							(busPointCounter + 1 == busPoints.size()) ? busPoints.get(0)
									: busPoints.get(busPointCounter + 1)));
				}

				day.lookOutForBusCount(collections);
				// day.getBusPoints().forEach(System.out::println);
				System.out.println(day);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
