import java.util.Scanner;
class AB
{
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    int n = sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
         if(i==3&&j==3)
         {
         	continue;
         }
           System.out.println("s");
		}
	}
   }
}