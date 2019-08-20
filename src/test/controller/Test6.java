package test.controller;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Test6 t6 = new Test6();
		t6.switchPrint();
	}
	
	public void switchPrint() {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		String result = "";

		//무한 반복
		for(;;) {
			//숫자 1개를 입력받는다.
			System.out.print("숫자를 입력하세요 : ");
			input = sc.nextInt();
			
			switch(input) {
			//입력이 1일 경우
			case 1:
				result = "**입력이 정상적으로 되었습니다!**";
				break;
			//입력이 2일 경우
			case 2:
				result = "**조회가 시작되었습니다!**";
				break;
			//입력이 3일 경우
			case 3:
				result = "**수정이 정상적으로 되었습니다!**";
				break;
			//입력이 4일 경우
			case 4:
				result = "**삭제가 정상적으로 되었습니다!**";
				break;
			//입력이 5일 경우
			case 5:
				result = "**정상적으로 종료 되었습니다!**";
				break;
			//입력이 1~5가 아닐 경우
			default:
				result = "**다시 입력해 주세요**";
				break;
			}
			//결과 출력
			System.out.println(result);
			//result값 초기화
			result ="";
		}
	}
}
