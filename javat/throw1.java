class throw1
{
	void Age(int age)
	{
	if(age<18)
	throw new ArithmeticException("Less than 18");
	else
	System.out.println("Valid age");
	}
	public static void main(String args[])
	{
	 throw1 obj=new throw1();
	 obj.Age(14);
	}
}