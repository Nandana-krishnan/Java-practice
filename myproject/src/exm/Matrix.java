package exm;
import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[][] = new int [5][5];
		int B[][] = new int [5][5];
		int C[][] = new int [5][5];
		System.out.println("Enter the number of rows and colums of first matrix:");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter the number of rows and colums of second matrix:");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		if(c1 == r2)
		{
			System.out.println("Enter the elements of first:");
			for(int i=0;i<r1;i++)
				for(int j = 0;j<c1;j++)
					A[i][j] = sc.nextInt();
			System.out.println("Enter the elements of second:");
			for(int i=0;i<r2;i++)
				for(int j = 0;j<c2;j++)
					B[i][j] = sc.nextInt();
			System.out.println("FIRST MATRIX:");
			for(int i=0;i<r1;i++)
			{
				for(int j = 0;j<c1;j++)
				{
					System.out.print(A[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("SECOND MATRIX:");
			for(int i=0;i<r2;i++)
			{
				for(int j = 0;j<c2;j++)
				{
					System.out.print(B[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("PRODUCT MATRIX:");
			for(int i=0;i<r1;i++)
			{
				for(int j = 0;j<c2;j++)
				{
					C[i][j] = 0;
					for(int k = 0;k<r2;k++)
					{
						C[i][j] = C[i][j] + A[i][k] * B[k][j];
					}
					System.out.print(C[i][j] + " ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Mul not pos");
	}
}
