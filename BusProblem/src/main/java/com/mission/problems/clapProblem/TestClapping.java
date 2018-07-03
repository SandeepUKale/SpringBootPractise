package com.mission.problems.clapProblem;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestClapping {

	public static void main(String[] args) {
		String fileName = "C:/sandeep/Planner/BusProblem/src/main/resources/input_2.txt";

		try (Scanner scanner = new Scanner(new File(fileName))) {

			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				if (line == null || line.isEmpty()) {
					continue;
				}
				int noOfExperiements = Integer.parseInt(line);

				for (int rowCounter = 0; rowCounter < noOfExperiements; rowCounter++) {
					System.out.println("Experiment-" + (rowCounter + 1) + ": " + isONOFF(scanner.nextLine()));
				}
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static String isONOFF(String inputLine) {
		String[] clapArray = inputLine.split("\\s+");
		int noOfClappers = Integer.parseInt(clapArray[0]);
		int noOfClaps = Integer.parseInt(clapArray[1]);

		return ((noOfClaps - (Math.pow(2, noOfClappers) - 1)) % (2 * noOfClappers) == 0) ? "ON" : "OFF";
	}

}
