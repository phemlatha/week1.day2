package Week1.day2.Assignment;
import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,0,4,6,8,0};
		int alen=a.length;
		for (int i = 0; i< alen; i++)
		{
			for (int j = i+1; j< alen; j++)
			{
				if (a[i] == a[j])
				{System.out.println("duplicates  in the array are " + a[j]);}
			}
		}

	}

}
