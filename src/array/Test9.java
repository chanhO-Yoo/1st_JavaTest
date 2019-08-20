package array;

public class Test9 {
	public static void main(String[] args) {
		Test9 t9 = new Test9();
		t9.bigAndSmall();
	}
	
	public void bigAndSmall() {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int big = 0;
		int small = 100;
		
		//2차원 배열을 돌면서
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				//만약 big값이 배열값 보다 작으면
				if(big<=array[i][j]) {
					//big값을 배열값으로 변경
					big = array[i][j];
				}
				//만약 small값이 배열값보다 크면
				if(small>=array[i][j]) {
					//small값을 배열값으로 변경
					small = array[i][j];
				}
			}
		}
		System.out.println("가장 큰 값 : "+big);
		System.out.println("가장 큰 값 : "+small);
	}
}
