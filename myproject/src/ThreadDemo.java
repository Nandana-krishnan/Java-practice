public class ThreadDemo {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("before"+t);
		t.setName("nandu");
		System.out.println("After"+t);
		try
		{
			for(int i=0 ;i<5 ;i++)
				System.out.println(i);
			    Thread.sleep(500);
		}
		catch(InterruptedException a)
		{
			System.out.println("Interrupted");
		}
	}

}
