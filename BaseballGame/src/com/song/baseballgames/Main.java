package com.song.baseballgames;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;

		int[] noArray = new int[NO_COUNT];
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		
// 랜덤값 3개 추출//중복 없음//
		
		
		
		//콘솔에서 값을 입력받기 위한 객체
		Scanner scan= new Scanner(System.in);
		
		for(int i=0;i<NO_COUNT;i++) {
			//1~9사이의 값만 받는다. 
			System.out.print("값을 입력해 주세요");
			int value=scan.nextInt();
			
			if(value<0 || value>9)
			{System.out.print("값을 다시 입력해주세요");i--;}
			else userNoArray[i]=value;
		}		
		
		scan.close();
		
		
			
		for(int item:randomNoArray)
			
		{System.out.println("value: "+item);}
		
		
	
	while(true) {
		for(int i=0;i<NO_COUNT;i++) {
			System.out.print("값을 입력해주세요: ");
			int value=scan.nextInt();
			userNoArray[i]=value;
		}
		int s=0,b=0;
		
		for(int i=0;i<NO_COUNT;i++) {//랜덤
			
			for(int z=0;z<NO_COUNT;z++) {//사용자 입력
				if(randomNoArray[i]==userNoArray[z]) {
					if(i==z) {
						s++;
					}else {
						b++;
					}
					
				}
			}
			
		}
		System.out.printf("S:%d,B: %d,O:%d",s,b);
		if(s==NO_COUNT) {
			System.out.println("---게임 종료------");
			break;
		}
	}
		
	}
}
