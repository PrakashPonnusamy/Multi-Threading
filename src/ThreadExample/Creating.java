package ThreadExample;

class Creating extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Method....");
		}
	}
public static void main(String[] args) throws InterruptedException
{
	Creating c = new Creating();
	Thread t=new Thread(c);
	Thread t1=new Thread(c);
	t.start();
	//Thread.sleep(2000);
	for(int i=0;i<5;i++)
	{
		System.out.println("Parent Method....");
	}
	System.out.println(Thread.currentThread());
	Thread.currentThread().setPriority(7);
	System.out.println(Thread.MAX_PRIORITY);
}
}
