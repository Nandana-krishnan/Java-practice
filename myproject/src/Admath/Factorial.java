//Factorial-Nandana Krishnan
package Admath;
import java.util.Scanner;
public class Factorial {
		void factorial(int n)
		{
			int f=1;
			for(int i=1;i<=n;i++)
			{
				f=f*i;
			}
			System.out.println("Factorial:"+f);
		}
		public static void main(String args[])
		{
			Factorial ob=new Factorial();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number");
			int n=sc.nextInt();
			ob.factorial(n);
		}

	}
