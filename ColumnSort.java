import java.util.*;
public class ColumnSort
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(arr[i][j]<arr[k][j])
                    {
                        arr[i][j] = arr[i][j] + arr[k][j];
                        arr[k][j] = arr[i][j] - arr[k][j];
                        arr[i][j] = arr[i][j] - arr[k][j];
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}