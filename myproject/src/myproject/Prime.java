
package myproject;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		int a,b,i,j,flag;
		System.out.println("Enter the first limit");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the second limit");
		b=sc.nextInt();
		System.out.println("The prime numbers between the limits "+a +" and"+b +" 2are:");
		for(i=a;i<=b;i++)
		{
			if(i==1||i==0)
			continue;
			flag=1;
			
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			System.out.println(i);
		}

	}

}
