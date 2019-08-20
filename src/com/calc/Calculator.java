package com.calc;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int input1 = 0;
		int input2 = 0;
		
		while(true) {
			//정수 두개를 입력받는다
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 정수를 입력하세요 : ");
			input1 = sc.nextInt();
			//입력받은 첫번째 정수가 1~10사이가 아닐경우
			if(input1>9 || input1<1) {
				System.out.println("다시입력하세요");
				continue;
			}
			//입력받은 첫번째 정수가 1~10사이인 경우
			else {
				//두번째 정수를 입력받는다.
				System.out.print("두번째 정수를 입력하세요 : ");
				input2 = sc.nextInt();
				//입력받은 두번쨰 정수가 1~10사이가 아닌경우
				if(input2>9 || input2<1) {
					System.out.println("다시입력하세요");
					continue;
				}
				//입력값이 모두 1~10인경우 
				//입력받은 인자 2개를 calculation메서드로 넘긴다.
				c.calculation(input1,input2);
				//인접 while문 탈출
				break;
			}
		}
		
	}
	
	//사칙연산을 진행하는 메서드
	public void calculation(int i, int j) {
		//합을 구해 출력한다.
		int plus = i+j;
		System.out.println("합 : " + plus);
		//차을 구해 출력한다.
		int minus = i-j;
		System.out.println("차 : " + minus);
		//곱을 구해 출력한다.
		int multi = i*j;
		System.out.println("곱 : " + multi);
		//몫을 구해 출력한다.
		int divide = i/j;
		System.out.println("나누기 : " + divide);
	}
}
