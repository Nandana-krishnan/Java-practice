package myproject;
import java.util.Scanner;
import java.util.StringTokenizer;
class StringaTokenizerSum
{
	public static void main (String []args)
	{
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some integers with comma:");
		String s = sc.next();
		StringTokenizer st = new StringTokenizer(s,",");
		while(st.hasMoreTokens())
		{
			String temp = st.nextToken();
			num = Integer.parseInt(temp);
			sum = sum +num;
		}
		System.out.println("Sum of them:"+sum);
		
	}
}