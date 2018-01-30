import java.util.Scanner;
class BB
{
	public static void main(String args[])
	{ Scanner s = new Scanner(System.in);
            System.out.print("Enter the value of i");
            int i = s.nextInt();
      switch(i)
      {
      case 0:
      {
      System.out.print("Apple");
      break;
      }
      case 1:
      {
      System.out.print("mango");
      break;
      }
      case 2:
      {
      System.out.print("idiot");
      break;
      }
      default :
      {
      System.out.print("bhag");
      break;
      }
      }
	}
}