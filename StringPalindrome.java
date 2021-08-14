package Week1.day2.Assignment;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r ="radar";
		String reverse = ""; 
		int len = r.length();
		 
		 for (int i =len -1; i>=0; i--)
		 {
			 
			 
			 reverse = reverse +r.charAt(i);
			 if(r.equals(reverse))
			 {
				 System.out.println("its a Palindrome" + r);
			 
				 }
			 else 
			 {
				 System.out.println("its NOT  Palindrome" + r);
			 }
		 }
		

	}

}
