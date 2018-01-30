class poly
{
	int xyz()
	{
	int a=0;
	return a;
	}
	int xyz(int a,int b)
	{
		int s=0;
		s=a+b;
		return s;
	}
}
class poly1
{
	public static void main(String args[])
	{
		int sum;
		int x;
		poly obj=new poly();
		x=obj.xyz();
		System.out.println("x :"+x);
		sum=obj.xyz(4,5);
		System.out.println("sum :"+sum);
	}
}