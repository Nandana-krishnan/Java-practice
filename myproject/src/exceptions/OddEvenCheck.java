package exceptions;
import java.util.Scanner;
class EvenNumberException extends Exception
{
	EvenNumberException(int n)
	{
		System.out.println("it is an even");
	}
}
class OddNumberException extends Exception
{
	OddNumberException(int n)
	{
		System.out.println("it is an odd");
	}
}
public class OddEvenCheck {

	public static void main(String[] args) throws EvenNumberException,OddNumberException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check:");
		int n =sc.nextInt();
		try
		{
			if(n%2==0)
				throw new EvenNumberException(n);
			else
				throw new OddNumberException(n);
		}
		catch(EvenNumberException e)
		{
			System.out.println("Exception caught is" +e);

		}
		catch(OddNumberException o)
		{
			System.out.println("Exception caught is" +o);
		}
	}
}
