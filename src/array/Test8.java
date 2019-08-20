package array;

public class Test8 {
	public static void main(String[] args) {
		Test8 t8 = new Test8();
		t8.multiDimentionArraySum();
	}
	
	public void multiDimentionArraySum() {
		int[][] array = {{12,41,36,56},{82,10,12,61},{14,16,18,78},{45,26,72,23}};
		double sum = 0;
		double avg = 0;
		int count = 0;
		
		//이차원 배열의 array[]의 갯수만큼(=행의 수만큼) 반복
		for(int i=0;i<array.length;i++) {
			//이차원 배열의 array[][]의 갯수만큼(=열의 수만큼) 반복
			for(int j=0;j<array[i].length;j++) {
				//배열에 들어있는 값의 합
				sum += array[i][j];
				//배열에 들어있는 값의 갯수 카운트
				count += 1;
			}
		}
		//평균을 구하는 함수
		avg = sum/count;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);	
		
	}
}
