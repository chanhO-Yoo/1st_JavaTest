package array;

import java.util.Arrays;

public class Test10 {
	public static void main(String[] args) {
		Test10 t10 = new Test10();
		t10.newArrayMultipleOfThree();		
	}
	
	public void newArrayMultipleOfThree() {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		//arrayCount 배열의 길이 카운트
		int arrayCount = 0;
		//copyArCount의 현재 길이 카운트
		int copyArCount = 1;
		//switch문을 사용하기 위한 변수
		int count = 0;
		String result = "";
		
		//사용할 2차원 배열 array의 행의 갯수와 열의 갯수를 구하기 위한 arrayCount변수 사용
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				arrayCount += 1;
			}
		}

		// 위 for문에서 구한 2차원 배열 array의 행의 값과 열의 갯수를 사용한 copyAr배열 선언
		int[] copyAr = new int[arrayCount];
		
		//array배열을 확인하면서 3의 배수인 값을 찾는다.
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				//array의 값이 3의 배수인 경우
				if(array[i][j]%3==0) {
					//k가 0부터 copyAr에 입력된 갯수만큼 반복
					for(int k=0;k<=copyArCount-1;k++) {
						//array의 값이 copyAr에 있는 값과 같으면 count를 1증가
						if(copyAr[k]==array[i][j]) {
							count=3;
						}
					}
					//count값이 0인경우 copayAr의 해당 위치에 array의 값을 넣는다.
					switch(count) {
					//같지 않은경우에만 들어온다.
					case 0:
						copyAr[copyArCount] = array[i][j];
						break;
					default:
						break;
					}
					//count 값 초기화
					count = 0;
					//copyArCount값 증가
					copyArCount += 1;
				}

			}
		}
		
		result += "copyAr : ";
		for(int i=0;i<copyAr.length;i++) {
			if(copyAr[i]!=0) {
				result += copyAr[i]+" ";				
			}
		}
		
		System.out.println(result);
	}
}
