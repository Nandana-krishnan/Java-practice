package myproject;
//QUICK SORT-VML20CS122
import java.util.Scanner;
public class QuickSort
{
	String temp;
	void quickSort(String A[], int low, int high)
	{
		if(low < high)
	        {
	        	String pivot = A[low];
	            int i = low;
	            int j = high;
	            while(i < j)
	            {
	                i += 1;
	                while ((A[i].compareTo(pivot) <= 0) && (i < high) && (j > i)) 
	                {
	                    i++;
	                }
	                while ((A[j].compareTo(pivot) >= 0) && (j > low) && (j >= i)) 
	                {
	                    j--;
	                }
	                if (i < j)
	                {
	                    temp = A[i];
	                    A[i] = A[j];
	                    A[j] = temp;
	                }
	            }
	            temp = A[low];
	            A[low] = A[j];
	            A[j] = temp;
	            quickSort(A,low,j-1);
	            quickSort(A,j+1,high);
	        }
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    QuickSort qs = new QuickSort();
	    System.out.print("Enter the no of names : ");
	    int n = sc.nextInt();
	    System.out.println("Enter " + n + " names :");
	    String names[] = new String[n];
	    for (int i = 0; i < n; i++)
	    	names[i] = sc.next();
	    qs.quickSort(names,0,n-1);
	    System.out.println("\nThe Names in Sorted Order : ");
	    for (int i = 0; i < n; i++)
	    	System.out.print(names[i] + "\t");
	}
}
//OUTPUT
/*Enter the no of names : 
3
Enter 3 names :
siya
amal
kat
The Names in Sorted Order : 
amal	kat	siya*/
