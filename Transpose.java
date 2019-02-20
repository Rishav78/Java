import java.util.*;

public class Transpose
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = scanner.nextInt();
                a[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = a[(n-1-j)][i];
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}