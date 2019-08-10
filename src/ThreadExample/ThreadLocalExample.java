package ThreadExample;

public class ThreadLocalExample implements Runnable{
ThreadLocal tc = new ThreadLocal();
public void run()
{
	double d=Math.random()*100;
	tc.set(d);
	System.out.println(tc.get());
}
public static void main(String[] args)
{
	ThreadLocalExample tce=new ThreadLocalExample();
	Thread t1=new Thread(tce);
	Thread t2=new Thread(tce);
	t1.start();
	t2.start();
}
}
