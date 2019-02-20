import java.util.*;
public class Arrays
{
    static int Sum(int[] arr, int n)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i==n)
            {
                continue;
            }
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Sum(arr,i);
            System.out.printf("num -> %d\n",arr[i]);
        }
    }
}