package exceptions;
import java.util.Scanner;
public class ArrayDiv {

	public static void main(String[] args) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the size of A");
		int n =sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the size of B");
		int m =sc.nextInt();
		int b[]=new int[m];
		System.out.println("Enter the elements of A");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of B");
		for(i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		try
		{
			if(n>m)
			{
				for(i=0;i<n;i++)
				{
					int div = a[i]/b[i];
					System.out.println("value:");
			    }
			}
			else
			{
				for(i=0;i<m;i++)
				{
					int div= a[i]/b[i];
				}
			}
			for(i=0;i<n;i++)
				System.out.println("value:");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught"+e);
		}
		finally
		{
			System.out.println("Operation completed");
		}
	}

}
