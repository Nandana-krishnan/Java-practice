package myproject;
import java.util.*;
import java.io.*;
public class ArrayDemo {

	public static void main(String[] args) throws Exception,ArrayIndexOutOfBoundsException,ArithmeticException {
		Scanner sc = new Scanner(System.in);
		int i,t;
		float div;
		System.out.println("Enter first size");
		int n = sc.nextInt();
		System.out.println("Enter second size");
		int m = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		try
		{
			System.out.println("Enter first elemnts");
			for(i= 0; i<n;i++)
				a[i] = sc.nextInt();
			System.out.println("Enter second elemnts");
			for(i= 0; i<m;i++)
				b[i] = sc.nextInt();
			if(n>m)
				t=n;
			else
				t=m;
			for(i= 0; i<t;i++)
			{
				div = a[i]/b[i];
				System.out.println(div);
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ahem");
		}
		catch(ArrayIndexOutOfBoundsException ea)
		{
			System.out.println("nooo");
		}
		catch(Exception pk)
		{
			System.out.println("ok");
		}
		finally
		{
			System.out.println("opertion completsd");
		}
	}
}
