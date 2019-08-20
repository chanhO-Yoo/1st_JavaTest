package test.controller;

public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.sum();
	}
	
	public void sum() {
		//1-100의 합을 담을 double타입 변수
		double sum = 0;
		//1-100의 평균을 담을 double타입 변수
		double avg = 0;
		//1~100까지 반복문(while문 사용)
		int i = 0;
		while(i<100) {
			i++;
			//합계는 매 i를 더해서 저장
			sum += i;
		}
		//평균은 합계를 i값으로 나누어 저장
		avg = sum/i;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}
}
