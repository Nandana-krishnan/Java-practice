package exceptions;
import java.util.Scanner;
class InvalidNumberException extends Exception
{
	InvalidNumberException(int num)
	{
		System.out.println("Number cant be negative or zero");
	}
}
public class InvalidNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n = sc.nextInt();
		int i,sum =0;
		int a[] = new int[n];
		System.out.println("Enter"+n+ "the terms");
		for(i=0;i<n;i++)
			a[i] = sc.nextInt();
		try
		{
			for(i=0;i<n;i++)
			{
				if(a[i]<=0)
					throw new InvalidNumberException(a[i]);
				else
					sum = sum+a[i];
			}
			System.out.println("SUM:"+sum);
			System.out.println("Average:"+(sum/n));
		}
		catch(InvalidNumberException e)
		{
			System.out.println("Caught"+e);
		}
		
	}

}
