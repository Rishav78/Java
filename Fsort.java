import java.util.*;

public class Fsort
{
    static int Freq(int[] arr, int n)
    {
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[n] && i!=n)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            int j;
            n = Freq(arr,i);
            for(j=i-1;j>=0;j--)
            {
                if(freq[j]<=n)
                {
                    break;
                }
                freq[j+1]=freq[j];
                arr[j] = arr[j] + arr[j+1];
                arr[j+1] = arr[j] - arr[j+1];
                arr[j] = arr[j] - arr[j+1];
            }
            freq[j+1]=n;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d -> %d\n",arr[i],freq[i]);
        }
    }
}