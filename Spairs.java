import java.util.*;//Pairs whose sum is equal to sum
public class Spairs
{
    static void Pairs(int[] arr, int sum)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.printf("%d + %d\n",arr[i],arr[j]);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        sum = scanner.nextInt();
        Pairs(arr,sum);
    }
}