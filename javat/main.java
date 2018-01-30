class poly
{
	int xyz()
	{
	int a,b;
	//a aur b dono return karane hain
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
		poly obj=new poly();
		sum=obj.xyz(4,5);
		System.out.println("sum :"+sum);
	}
}