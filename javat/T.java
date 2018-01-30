class T extends Thread
{
public void run()
{
	System.out.println("thread running");
}
}
class S extends Thread
{
public void run()
{
	System.out.println("bleh");
}
}
class R extends Thread
{
public void run()
{
	public static void main(String args[])
	{
		T a=new T();
		S b=new S();
		R c=new R();
		a.start();
		b.start();
		c.start();

	}
	public void run()
	{
		System.out.println("Start");
	}
}
