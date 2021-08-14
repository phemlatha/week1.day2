package Week1.day2.Assignment;

public class Calculator {
	
	public int add (int num1,int num2, int num3)
	{
		int sum = num1+num2+num3;
		return sum; 
	
	}

	public int sub ( int num1,int num2)
	{

		int sub = num1-num2;
		return sub; 
	
	}
	
	public double mul (double num1, double num2)
	{
		
		double mul = num1*num2;
		return mul; 
	
	}
	
	public float div (double d,double e)
	{
		float div = (float) (d/e);
		return div; 
		
	
	}
	
	
	
	


	public static void main(String[] args) {
		Calculator obj = new Calculator() ;
		int addition = obj.add(10,5,10);
		int subtraction = obj.sub(10, 5);
		double mul  =  obj.mul(14.1,15.1);
		float div = obj.div(625.1, 25.1);
		
		
		
		System.out.println("Additon result is "  +addition);
		System.out.println("Subtraction result is "  +subtraction);
		System.out.println("multiplication result is "  +mul);
		System.out.println("Division result is "  +div);
		
		
		
		// TODO Auto-generated method stub

	}

}
