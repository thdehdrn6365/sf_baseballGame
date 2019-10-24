package com.song.baseballgames;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;
		// int[] noArray = new int[NO_COUNT];
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		SetRandomArray(randomNoArray);
		

		// 콘솔에서 값을 입력받기 위한 객체
		Scanner scan = new Scanner(System.in);

		for (int item : randomNoArray)

		{
			System.out.print(" Value: " + item);
		}
		System.out.println();
		// 게임시작

		while (true) {
			SetUserArray(scan,userNoArray);
			
			/*for (int i = 0; i < NO_COUNT; i++) {
				System.out.print("값을 입력해주세요: ");
				int value = scan.nextInt();

				if (value < 0 || value > 10) {
					System.out.println("값을 다시 입력해주세요!");
					i--;
				} else
					userNoArray[i] = value;
			}*/

			/**/
             int s=checkFinish(randomNoArray,userNoArray);
			if (s == NO_COUNT) {
				System.out.println("\n---게임 종료------");
				break;
			}
		}
        scan.close();
	}

	public static void SetRandomArray(int[] randomNoArray) {
		final int NO_COUNT = 3;
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
		// for (int item:randomNoArray) {
		// System.out.println(item);

	}
	public static void SetUserArray(Scanner scan,int[]userNoArray) {
		
	int NO_COUNT=3;
		for (int i = 0; i < NO_COUNT; i++) {
			System.out.print("값을 입력해주세요: ");
			int value = scan.nextInt();

			if (value < 0 || value > 10) {
				System.out.println("값을 다시 입력해주세요!");
				i--;
			} else
				userNoArray[i] = value;

		
	}

}
	public static int checkFinish(int[]randomNoArray,int[]userNoArray) {
		int NO_COUNT=3;
		int s = 0, b = 0;

		for (int i = 0; i < NO_COUNT; i++) {// 랜덤

			for (int z = 0; z < NO_COUNT; z++) {// 사용자 입력
				if (randomNoArray[i] == userNoArray[z]) {
					if (i == z) {
						s++;
					} else {
						b++;
					}

				}
			}

		}
		System.out.printf("S:%d,B: %d\n", s, b);
		return NO_COUNT;
	}
	
}
