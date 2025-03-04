package exceptions;

public class FinallyDemo {
	static void One()
	{
		try{
			System.out.println("One is here");
			throw new RuntimeException("Demo");
		}
		finally
		{
			System.out.println("One's finally");
		}
	}
	static void Two()
	{
		try{
			System.out.println("Two is here");
		}
		finally
		{
			System.out.println("Two's finally");
		}
	}
	public static void main(String[] args) {
		try {
			One();
		}
		catch(RuntimeException e)
		{
			System.out.println("Caught"+e);
		}
		Two();
		System.out.println("The End");
	}

}
