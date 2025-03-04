//Perfectnumber Checking- VML20CS122
package myproject;
import java.util.Scanner;
public class Perfectcheck {

	public static void main(String[] args) {
		
			    Scanner sc = new Scanner(System.in);
			    int dsum=0;
				System.out.println("Enter a positive integer to check:");
				int n = sc.nextInt();
		        for (int i= 1;i<=n/2;i++)
		        {
		        	if(n%i==0)
		        		dsum=dsum+i;
				}
		        if(dsum==n)
		        	System.out.println("Entered number is a perfect number");
		        else
		        	System.out.println("Entered number is not a perfect number");
			}
}
