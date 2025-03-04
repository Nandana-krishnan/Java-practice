package mypack;
/*public class ThrowsDemo {
	public static void main(String[] args) throws InterruptedException{
		/*There is a chance of exception when the main thread goes to sleep,
		other thread  get a chance to execute main() which will cause interrupted exception
		This can be prevented using throws.Now it will be handled by JVM (caller)
		Thread.sleep(10000);
		System.out.println("Testing the keyword");
	}
}*/
public class ThrowsDemo
{
	static void throwone() throws IllegalAccessException
	{
		System.out.println("Inside throwone");
		throw new IllegalAccessException("demo");
		/*An IllegalAccessException is thrown when an application tries to reflectively create an 
		 * instance (other than an array),set or get a field, or invoke a method, 
		 * but the currently executing method does not have access to the definition of the specified class, 
		field, method or constructor.*/
	}
	public static void main(String[] args) 
	{
		try 
		{
			throwone();
		}
		catch(IllegalAccessException l)
		{
			System.out.println("Caught"+l);
		}
	}
}
