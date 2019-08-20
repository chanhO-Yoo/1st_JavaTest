package array;

public class Test7 {
	public static void main(String[] args) {
		Test7 t7 = new Test7();
		t7.arrayOddSum();
	}
	
	public void arrayOddSum() {
		//사용할 정수형 배열 array 초기화
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		//합을 구할 변수
		double sum = 0;
		//홀수인 배열의 값을 저장
		String oddValue = "";
		
		//배열의 index가 0부터 배열의 길이 -1까지 반복
		for(int i=0;i<array.length;i++) {
			//배열의 값이 짝수이면
			if(array[i]%2==0) {
				//그냥 진행
				continue;
			}
			//배열의 값이 홀수이면
			else {
				oddValue += array[i]+"\n";
				//sum변수에 array값 더하기
				sum += array[i];			
			}
		}
		System.out.println(oddValue);
		System.out.println("합계 : " + sum);
	}
}
