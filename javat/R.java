import java.util.*;
import java.lang.*;
class T extends Thread
{ 
public void run()
{	//yield();
	System.out.println("thread running");
}
}
class S extends Thread
{
public void run()
{    
	Thread.yield();
	for(int i=0;i<5;i++)
	{
	        System.out.println("b");
    }
}
}
class R extends Thread
{
	Date d=new Date();
	public static void main(String args[])
	{
		T a=new T();
		S b=new S();
		R c=new R();
		a.start();
		b.start();
		c.start();
        System.out.println(c.d);
	}
	public void run()
	{
		try
		{
		Thread.sleep(10000);
	    }
        catch(InterruptedException e)
        {
        	System.out.println(e);
        }
		System.out.println("Start");
	}
}
