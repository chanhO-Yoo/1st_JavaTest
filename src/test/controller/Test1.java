package test.controller;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.printEven();
	}
	
	//입력이 1~100사이 정수이면서 짝수인지 판별
	public void printEven() {
		//무한반복
		for(;;) {
			//사용자로부터 정수를 입력받음.
			Scanner sc = new Scanner(System.in);
			int input = 0;
			String result = "";
			
			System.out.print("정수를 입력하세요 : ");
			input = sc.nextInt();
			
			//입력받은 정수가 1과 100사이의 정수인지 판별
			//1~100사이가 아닌 경우
			if(input<1 || input>100) {
				result = "1부터 100사이의 값을 입력하세요.";
			}
			//1~100사이인 경우
			else {
				//2의 배수인지 판별
				//입력값이 2의 배수인 경우
				if(input%2==0) {
					result = "2의 배수입니다.";
				}
				//입력값이 2의 배수가 아닌 경우
				else {
					result = "2의 배수가 아닙니다.";
				}
			}
			//결과값 출력
			System.out.println(result);
		}
	}
}
