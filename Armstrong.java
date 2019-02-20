import java.util.*;
import java.lang.Math.*;

public class Armstrong
{
    static int is_Armstrong(int n)
    {
        String f = Integer.toString(n);
        int p = f.length();
        int a=0;
        int dup=n;
        while(n>0)
        {
            a = a + (int)Math.pow(n%10,p);
            n/=10;
        }
        if(dup==a)
        {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(is_Armstrong(n)==1)
        {
            System.out.println("yup");
        }
        else
        {
            System.out.println("no");
        }
    }
}