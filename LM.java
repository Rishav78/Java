import java.util.*;
public class LM
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int small=32768,large=-32768,num;
        for(int i=0;i<n;i++)
        {
            num = scanner.nextInt();
            if(num>large)
            {
                large = num;
            }
            if(num<small)
            {
                small=num;
            }
        }
        System.out.println(small);
        System.out.println(large);
    }
}