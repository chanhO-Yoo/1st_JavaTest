package test.controller;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Test5 t5 = new Test5();
		t5.multiCipher();
	}
	
	public void multiCipher() {
		Scanner sc = new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;
		int result = 0;
		String resultPrint = "";
		
		while(true) {
			//첫번째 정수를 입력받아 input1에 저장
			System.out.print("첫번째 정수를 입력하세요 : ");
			input1 = sc.nextInt();
			//첫번째 정수가 1~9사이가 아닌경우
			if(input1<1 || input1>9) {
				resultPrint = "잘못된 입력입니다.";
				continue;
			}
			//첫번쨰 정수가 1~9사이인 경우
			else {
				//두번째 정수를 입력받아 input2에 저장
				System.out.print("두번째 정수를 입력하세요 : ");
				input2 = sc.nextInt();
				//두번째 정수가 1~9이 아닌 경우
				if(input2<1 || input2>9) {
					resultPrint = "잘못된 입력입니다.";
					continue;
				}
				//두번째 정수가 1~9인 경우
				else {
					//입력받은 두 수를 곱한 결과를 result에 저장
					result = input1 * input2;
					//result를 10으로 나눈 몫이 0일 경우 1자리수
					if(result/10==0) {
						resultPrint = "한자리 수 입니다.";
						break;
					}
					//result를 10으로 나눈 몫이 0이 아닌 경우 2자리 수
					else {
						resultPrint = "두자리 수 입니다.";					
						break;
					}
				}
			}
			
		}
		System.out.println(resultPrint);
	}
}
