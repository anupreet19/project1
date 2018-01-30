import java.util.Scanner;
class minarray
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
      System.out.println("elements are :");
      for(int i=0;i<n;i++)
      {
      System.out.print(" "+a[i]);
      }
      int min=a[0];
      for(int i=1;i<n;i++)
      {
      if(a[i]<min)
      {
      min=a[i];
      }
      }
      System.out.println("minimum element is :"+min);
    }
}