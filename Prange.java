import java.util.*;
import java.lang.Math.*;

public class Prange
{
    static void prange(int n)
    {
        int j;
        for(int i=2;i<n;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(j==i)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        prange(n);
    }
}