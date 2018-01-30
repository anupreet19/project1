import java.util.Scanner;
class Ab
{
	public static void main(String args[])
	{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    int n = sc.nextInt();
	aa:for(int i=0;i<n;i++)
	{
		bb:for(int j=1;j<n;j++)
		{
         if(i==3&&j==3)
         {
         	System.out.println("break");
         	break aa;
         }
		}
	}
   }
}