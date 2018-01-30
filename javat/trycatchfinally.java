class trycatchfinally
{
 	public static void main(String args[])
 	{
 	int a=0;
 	int b,c=5;
 	try
 	{
 	try
 	{	
 	b=c/a;
 System.out.println("b= "+b);}
 	catch(ArithmeticException e)
 	{
 	 System.out.println(e);	
 	}
 	try
 	{
 		String s=0;
 		System.out.println(s);
 	}
 	catch(NullPointerException e1)
 	{
      System.out.println(e1);
 	}
 	/*finally
 	{
 		System.out.println("Stupid finally will execute anyway");
 	}*/
 	System.out.println("bleh");
 	}
 	catch(Exception e2)
 	{
 		System.out.println(e2);
 	}
 }
}