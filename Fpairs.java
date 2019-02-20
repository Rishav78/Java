//FIND ALL THE PAIRS WITH IN THE ARRAY WHERE SUM IS MAX
import java.util.*;

public class Fpairs
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = -32768, max2 = -32768;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max2 && arr[i]<max)
            {
                max2=arr[i];
            }
        }
        System.out.printf("%d + %d -> %d",max,max2,max+max2);
    }
}