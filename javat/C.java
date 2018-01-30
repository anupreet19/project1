import java.util.Scanner;
class C
{
	public static void main(String args[])
	{ Scanner s = new Scanner(System.in);
            System.out.print("Enter the value of i");
            int i = s.nextInt();
            do
            {
             System.out.println("Fine!");
             i++;
            }
            while(i<=4);
        }
    }