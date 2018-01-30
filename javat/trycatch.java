class trycatch
{
 	public static void main(String args[])
 	{
 	int a=0;
 	int b,c=5;
 	try
 	{
 	b=c/a;
 System.out.println("b= "+b);}
 	catch(ArithmeticException e)
 	{
 	 System.out.println(e);	
 	}
 	finally
 	{
 		System.out.println("Stupid finally will execute anyway");
 	}
 	System.out.println("bleh");
 	}
}