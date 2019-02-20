import java.util.*;
public class IndexValue
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        for(int i=0;i<n;)
        {
            int t1,t2;
            t1 = scanner.nextInt();
            t2 = scanner.nextInt();
            if(t1 < arr.length && t2 < arr.length)
            {
                arr[t1] = arr[t1] + arr[t2];
                arr[t2] = arr[t1] - arr[t2];
                arr[t1] = arr[t1] - arr[t2];
                i++;
            }
            else
            {
                System.out.println("Try again");
            }
        }
        n = scanner.nextInt();
        System.out.println("num -> " + arr[n]);
    }
}