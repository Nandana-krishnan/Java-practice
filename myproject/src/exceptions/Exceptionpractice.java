//use of throw keyword-to explicitly throw an exception
package exceptions;
import java.util.Scanner;
public class Exceptionpractice {
	static void check_Eligi(int age,int weight)
	{
		if(age<12 || weight<30)
			throw new ArithmeticException("Invalid entry baby");
		else
			System.out.println("Eligible");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome babay");
		try
		{
			System.out.println("Enter age and weight");
			int a =sc.nextInt();
			int w = sc.nextInt();
			check_Eligi(a,w);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught"+e);
		}

	}

}
