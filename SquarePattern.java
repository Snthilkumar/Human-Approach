import java.util.*;
class SquarePattern
{
public static void main(String ar[])
{
Scanner o=new Scanner(System.in);
System.out.println("Enter row value");
int n=o.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print("*");
}
System.out.println();
}
}}