//Thread Synchronization-VML20CS122
import java.util.Scanner;
class NumTable
{
	synchronized static void printTable(int n)
	{
		System.out.println(Thread.currentThread().getName());
		for(int i =1 ;i<10;i++)
		{
			System.out.println(i+"*"+n +"="+i*n);
			try
			{
				Thread.sleep(500);
			}catch (Exception e) {}
		}
	}
}
class One extends Thread
{
	int n;
	public One(int n)
	{
		this.n = n;
	}
	public void run()
	{
		Thread.currentThread().setName("mul of "+n);
		NumTable.printTable(n);
	}
}
class Two extends Thread
{
	int n;
	public Two(int n)
	{
		this.n = n;
	}
	public void run()
	{
		Thread.currentThread().setName("mul of "+n);
		NumTable.printTable(n);
	}
}
public class ThreadSync
{
	public static void main(String []args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 2 nums:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	One o = new One(a);
	Two t = new Two (b);
	o.start();
	t.start();
}
}
/*OUTPUT
Multiplication table of 3
1*3=3
2*3=6
3*3=9
4*3=12
5*3=15
6*3=18
7*3=21
8*3=24
9*3=27
10*3=30
Multiplication table of 6
1*6=6
2*6=12
3*6=18
4*6=24
5*6=30
6*6=36
7*6=42
8*6=48
9*6=54
10*6=60*/
