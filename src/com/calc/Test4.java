package com.calc;

public class Test4 {
	public static void main(String[] args) {
		//입력받은 첫번째 인자를 int형 변수 i에 정의
		int i = Integer.parseInt(args[0]);
		//입력받은 두번째 인자를 int형 변수 j에 정의
		int j = Integer.parseInt(args[1]);
		
		//입력받은 두 인자가 1~10 사이인지 여부 판별
		//두 인자가 1~10 사이가 아닐경우
		if((i>9 || i<1) || (j>9 || j<1)) {
			System.out.println("잘못된 입력입니다.");
		}
		//두 인자가 1~10 사이인 경우
		else {
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
}
