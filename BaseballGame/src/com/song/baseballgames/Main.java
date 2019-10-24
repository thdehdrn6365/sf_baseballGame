package com.song.baseballgames;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;

		int[] noArray = new int[NO_COUNT];
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		// int randomValue = (int) (Math.random() * 9 + 1);

		for (int i = 0; i < NO_COUNT; i++) {
			int randomValue = (int) (Math.random() * 9 + 1);

			for (int z = 0; z < i + 1; z++) {
				if (randomNoArray[z] == randomValue) {
					i--;
					break;
				} else if (randomNoArray[z] == 0) {
					randomNoArray[z] = randomValue;
					break;
				}
			}

		}
		for (int item:randomNoArray) {
			System.out.println(item);
		}
	}
}
