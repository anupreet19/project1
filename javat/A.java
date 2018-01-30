class A
{
	int a;
	int b,z;
	A(int a,int b)
	{
	this.a=a;
	this.b=b;
	}
	A(int a,int b,int z)
	{
	this(a,b);
	this.z=z;
	}
	public static void main(String args[])
	{
     A obj=new A(2,3,4);
     System.out.println("a :"+obj.a);
     System.out.println("b :"+obj.b);
     System.out.println("z :"+obj.z);
	}
}
