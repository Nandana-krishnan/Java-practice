package myproject;
import java.util.Scanner;
public class Myclass {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int sum =0;
		 int i;
		 System.out.println("Enter a number:");
		 int n= sc.nextInt();
		 for(i=0;i<n;i++) {
			 sum=sum+i;
		 }
     System.out.println("SUM ="+sum);
	}
}
