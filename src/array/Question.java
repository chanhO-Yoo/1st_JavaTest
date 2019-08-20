package array;

import java.util.Arrays;

public class Question {
	public static void main(String[] args) {
		Question q = new Question();
		q.test5();
	}
	
	public void test5() {
	    int[] lotto = {1,2,3,1,5};
	    int copyIndex = 0;
	    
	    for(int i=0; i<5; i++) {
	        lotto[copyIndex] = lotto[i];
	        for(int j=0; j<copyIndex; j++) {
	            
	            if(lotto[i]==lotto[j]) {
	                copyIndex--;
	                break;
	            }
	        }
	        copyIndex++;
	    }
//	    for(int i = 0;i<copyIndex;i++) {
//	    	System.out.print(lotto[i]+" ");	    	
//	    }
	    System.out.println(Arrays.toString(lotto));
	}  
}
