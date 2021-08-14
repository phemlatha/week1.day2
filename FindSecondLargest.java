package Week1.day2.Assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,0,4,6,8,0};
		int alen=a.length;
		Arrays.sort(a);
		
		int secondLargest = a[alen-2];	
		
		System.out.println("secondLargest in array is" + secondLargest);
		
	}

}
