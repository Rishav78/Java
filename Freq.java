import java.util.*;
public class Freq
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[n];
        int i=0,j;
        while(n-->0)
        {
            arr[i] = scanner.nextInt();
            for(j=0;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    freq[j]++;
                    break;
                }
            }
            if(j==arr.length)
            {
                freq[i++]++;
            }
        }
        for(j=0;j<i;j++)
        {
            System.out.printf("%d -> %d\n",arr[j],freq[j]);
        }
    }
}