package Week1.day2.Assignment;
import java.util.Arrays;

public class FindIntersection {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int a1[] = {1,2,3,4,5};
		int b1[] = {2,4,6,7}; 
		 
		int alen= a1.length;
		int blen = b1.length;
		
		for (int i =0;i<alen;i++) 
		
		{ for (int j = 0;j<blen;j++)
		{
			if( a1[i] ==b1[j])
			{System.out.println("common elements in both array" + (a1[i]));}
		}
			
		}
		
		
		
		
	}

}
