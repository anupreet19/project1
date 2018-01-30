import java.util.Scanner;
class exc
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("number of elements:");
      int n=sc.nextInt();
      int[] a = new int[n];
      System.out.println("enter the elements:");
      for(int i=0;i<n;i++)
      {
      a[i]=sc.nextInt();
      }
      System.out.println("a[n]= "+a[n]);
      }
}
