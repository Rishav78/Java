import java.util.Scanner;
import java.lang.Math;
public class This
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int[][] arr = new int[a][b];
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<b;j++)
        {
            arr[i][j] = scanner.nextInt();
        }
    }
    System.out.println("---------------------------------------------------");
    for(int i=0;i<(int)Math.ceil(a/2);i++)
    {
        int j,k,l,m;
        for(j=i;j<b-i;j++)
        {
            System.out.println(arr[i][j]);
        }
        for(k=i+1;k<a-i;k++)
        {
            System.out.println(arr[k][j-1]);
        }
        for(l=(b-i-2);l>=i;l--)
        {
            System.out.println(arr[k-1][l]);
        }
        for(m=(a-2-i);m>=(i+1);m--)
        {
            System.out.println(arr[m][l+1]);
        }
    }
  }
}