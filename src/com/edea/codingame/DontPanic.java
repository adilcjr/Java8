package com.edea.codingame;

import java.util.*;
import java.io.*;
import java.math.*;

public class DontPanic {

	public static String evaluateCloneDirection(int aClonePos, int targetPos) {

		String direction = "";

		if (aClonePos <= targetPos) {
			direction = "RIGHT";
		} else {
			direction = "LEFT";
		}

		return direction;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int nbFloors = in.nextInt(); // number of floors
		int width = in.nextInt(); // width of the area
		int nbRounds = in.nextInt(); // maximum number of rounds
		int exitFloor = in.nextInt(); // floor on which the exit is found
		int exitPos = in.nextInt(); // position of the exit on its floor
		int nbTotalClones = in.nextInt(); // number of generated clones
		int nbAdditionalElevators = in.nextInt(); // ignore (always zero)
		int nbElevators = in.nextInt(); // number of elevators
		// int elevatorFloor = 0;
		// int elevatorPos = 0;
		int lastFloorBlocked = 0;
		String dirClone = "";
		int[] elevatorsPos = new int[nbElevators];
		for (int i = 0; i < nbElevators; i++) {
			// elevatorsFloor = in.nextInt(); // floor on which this elevator is found
			// elevatorPos = in.nextInt(); // position of the elevator on its floor

			elevatorsPos[in.nextInt()] = in.nextInt();

		}

		boolean blocked = false;

		// game loop
		while (true) {
			int cloneFloor = in.nextInt(); // floor of the leading clone
			int clonePos = in.nextInt(); // position of the leading clone on its floor
			String direction = in.next(); // direction of the leading clone: LEFT or RIGHT

			// Write an action using System.out.println()
			// To debug: System.err.println("Debug messages...");
			System.err.println("cloneFloor: " + cloneFloor);
			System.err.println("clonePos: " + clonePos);
			System.err.println("direction: " + direction);
			System.err.println("nbElevators: " + nbElevators);
			if (nbElevators > 0)
				System.err.println("ElevatorPos: " + elevatorsPos[nbElevators - 1]);
			System.err.println("ExitPos: " + exitPos);

			// if (cloneFloor > lastFloorBlocked) blocked = false;

			if (nbElevators > 0) {

				// valida por elevador
				System.err.println("Elevator[" + lastFloorBlocked + "] @ position " + elevatorsPos[lastFloorBlocked]);
				dirClone = evaluateCloneDirection(clonePos, elevatorsPos[lastFloorBlocked]);
				System.err.println("Direction: " + dirClone);

			} else {

				// valida pos saida
				dirClone = evaluateCloneDirection(clonePos, exitPos);

			}

			if (!dirClone.equals(direction)) {

				if (!blocked) {
					System.out.println("BLOCK");
					blocked = true;
					lastFloorBlocked++;
					if (nbElevators > 0)
						nbElevators--;
				} else {
					System.out.println("WAIT");
					// lastFloorBlocked++;
					if (cloneFloor > lastFloorBlocked) {
						blocked = false;
						lastFloorBlocked++;
						if (nbElevators > 0)
							nbElevators--;
					}
				}
			} else {
				System.out.println("WAIT");
			}

			// action: WAIT or BLOCK
		}
	}
}
