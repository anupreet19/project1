import java.util.Scanner;
class student
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your name");
      String name = sc.next();
      System.out.println("name "+name);
      System.out.println("enter your roll no.");
      int roll=sc.nextInt();
      System.out.println("roll no. " +roll);
	}
}