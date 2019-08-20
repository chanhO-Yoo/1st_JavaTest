package test.controller;

public class Test2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.oddResult();
	}
	
	public void oddResult() {
		int result = 0;
		String printResult = "";
		
		//구구단 만들기 (중첩for문 사용)
		for(int i=2;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				//결과값이 홀수인지 판별
				result = i*j;
				//구구단의 결과가 홀수일 경우
				//출력결과값에 추가
				if(result%2==1) {
					printResult+=i+" X "+j+" = "+result+"\n";
				}
				//결과값 초기화
				result = 0;
			}
			//출력 구분선
			printResult += "-=-=-=-=-=-=-=-=-=-=-\n";
		}
		//최종 결과 출력
		System.out.println(printResult);
	}
}
