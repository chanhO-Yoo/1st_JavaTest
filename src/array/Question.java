package array;

import java.util.Arrays;

public class Question {
	public static void main(String[] args) {
		Question q = new Question();
		q.test5();
	}
	
	public void test5() {
	    int[] lotto = {1,2,3,1,5};
	    int copyIndex = 0;//추가된 내용 : 중복되면 인덱스를 한칸 줄이기 위해 사용한 변수
	    
	    for(int i=0; i<5; i++) {
	        lotto[copyIndex] = lotto[i]; //추가된 내용 : lotto[0] = lotto[0]에 넣기
	        for(int j=0; j<copyIndex; j++) { //바뀐내용 : j의 조건식을 새로만들어준 copyIndex의 값전까지만 배열 검사
			 								 //왜? : 자기자신과 비교하기 않게 하기위해서
											 //    + 이미 들어가 있는 값과 들어갈 값을 비교하기 위해서
	            if(lotto[i]==lotto[j]) {	 // 이미 들어가있는 값과 새롭게 들어간 값이 같다면
	                copyIndex--; 			 // index의 값을 다시 감소시켜 방금 들어간 index위치에 다시 입력하겠다.
	                break;
	            }
	        }
	        copyIndex++;//추가된 내용 : 중복이 없이 들어갔다면 copyIndex의 값을 1 증가. 즉 다음 배열 index에 새로운 값을 넣겠다.
	    }
		//예쁘게 출력하기 : 최종으로 바뀐 index값(중복이 1개라면 원래 인덱스보다 1작은 길이)만큼만 들어있는 값을 출력하겠따.
	    for(int i = 0;i<copyIndex;i++) {
	    	System.out.print(lotto[i]+" ");	    	
	    }
		
	
//	
//	
//	public void test5() {
//	    int[] lotto = {1,2,3,1,5};
//	    int copyIndex = 0;
//	    
//	    for(int i=0; i<5; i++) {
//	        lotto[copyIndex] = lotto[i];
//	        for(int j=0; j<copyIndex; j++) {
//	            
//	            if(lotto[i]==lotto[j]) {
//	                copyIndex--;
//	                break;
//	            }
//	        }
//	        copyIndex++;
//	    }
////	    for(int i = 0;i<copyIndex;i++) {
////	    	System.out.print(lotto[i]+" ");	    	
////	    }
//	    System.out.println(Arrays.toString(lotto));
//	}  
}
