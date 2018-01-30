import java.util.Scanner;
class switchcalci
{
	public static void main(String args[])
	{ Scanner s = new Scanner(System.in);
        System.out.println("enter two values");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("add=+ ,"+"subtract=- ,"+"multiply=* ,"+"division=/");
        System.out.println("enter the operation to be performed");
        char i = s.next().charAt(0);
      switch(i)
      {
      case '+':
      {
         int x=a+b;
      System.out.print("ans= "+x);
      break;
      }
      case '-':
      {
            int x=a-b;
      System.out.print("ans= "+x);
      break;
      }
      case '*':
      {
            int x=a*b;
      System.out.print("ans= "+x);
      break;
      }
      case '/':
      {
            int x=a/b;
      System.out.println("ans= "+x);
      break;
      }
      default :
      {
      System.out.print("operation not possible");
      break;
      }
      }
	}
}