import java.util.*;
import java.lang.Math;

public class StrongN
{
    static int fact(int n)
    {
        int n1=1;
        while(n>0)
        {
            n1*=n;
            --n;
        }
        return n1;
    }
    static boolean Check(int n)
    {
        int n1 = n,n2=0;
        while(n1>0)
        {
            n2 = n2 + fact(n1%10);
            n1/=10;
        }
        if(n2==n)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(Check(n))
        {
            System.out.println(n);
        }
    }
}