package Week1.day2.Assignment;


import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 3,2,4,1,7,6};
		int len = num.length;
		
		Arrays.sort(num);
		for (int i = 0; i <= len  ; i++) {
			 			 
			 if (num[i]+1 != num[i+1])
			 {
				 System.out.println("Missing element " + (num[i]+1));
			 }
			 
			 }
		 }

	}


