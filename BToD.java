import java.util.*;
import java.lang.Math.*;

public class BToD
{
    static int btod(int n)
    {
        int d = 0;
        int count=0;
        while(n>0)
        {
            d = d + (n%10)*(int)Math.pow(2,count);
            n = n/10;
            count++;
        }
        return d;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(btod(n));
    }
}