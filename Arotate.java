import java.util.*;

public class Arotate
{
    static void rotate(int[] arr)
    {
        int dup = arr[0];
        for(int i=0;i<(arr.length-1);i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=dup;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1 = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<n1;i++)
        {
            rotate(arr);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("num -> %d\n",arr[i]);
        }
    }
}