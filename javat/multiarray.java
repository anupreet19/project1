import java.util.Scanner;
class multiarray
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
int[][] a = new int[2][3];
int[][] b = new int[2][3];
int[][] c = new int[2][3];
 System.out.println("enter the elements of a");
 for(int i=0;i<2;i++)
 {
 for(int j=0;j<3;j++)
 {
  a[i][j]=sc.nextInt();
 }
 }
 System.out.println("a :");
 for(int i=0;i<2;i++)
 {
 for(int j=0;j<3;j++)
 {
  System.out.print(" "+a[i][j]);
 }
 }
 System.out.println("enter the elements of b");
 for(int i=0;i<2;i++)
 {
 for(int j=0;j<3;j++)
 {
  b[i][j]=sc.nextInt();
 }
 }
 System.out.println("b :");
 for(int i=0;i<2;i++)
 {
 for(int j=0;j<3;j++)
 {
  System.out.print(" "+b[i][j]);
}}
for(int i=0;i<2;i++)
 {
 for(int j=0;j<3;j++)
 {
  c[i][j]=a[i][j]+b[i][j];
 }
 }
 for(int i=0;i<2;i++)
 {
 for(int j=0;j<3;j++)
 {
  System.out.print(" "+c[i][j]);
}
}
 }
 }