//Swapping largest and smallest of the array-VML20CS122
package myproject;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,temp,spos=0,lpos=0;
		System.out.println("Enter size of the array :");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the array elements:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//Finding smallest element
		int sml = a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]<sml)
			{
				sml = a[i];
			    spos = i;
			}
	    }
		//Finding Largest element
		int lrg = a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>lrg)
			{
				lrg = a[i];
				lpos = i;
			}
		}
		//Swapping largest and smallest elements
		temp = a[spos];
		a[spos] = a[lpos];
		a[lpos] = temp;
		System.out.println("Array after swap :");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}

}
