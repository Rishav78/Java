import java.util.*;
public class NextHigest
{
    static void Higest(int[] arr, int i)
    {
        int max=arr[i++];
        for(;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                break;
            }
        }
        if(i==arr.length)
        {
            System.out.println(0);
            return;
        }
        System.out.println("num -> " + max);
    }
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            Higest(arr,i);
        }
    }
}