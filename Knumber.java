import java.util.*;
import java.lang.Math;

//KAPREKAR NUMBER
//45 -> 2025 -> 20 + 25 -> 45

public class Knumber
{
    static boolean kaprekar(int n, int o)
    {
        String s = Integer.toString(n);
        int l = s.length();
        if(n<o)
        {
            return false;
        }
        int flag = l%2,n1=0,n2=0;
        while(flag>=0)
        {
            n2 = n%(int)Math.pow(10,l/2 + flag);
            n1 = n/(int)Math.pow(10,l/2 + flag);
            if((n1+n2)*(n1+n2)==o)
            {
                return true;
            }
            System.err.println(n2 + " " + n1);
            flag--;
        }
        return  kaprekar(n1+n2,o);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n*=n;
        System.out.println(n);
        if(kaprekar(n,n))
        {
            System.out.println("yup");
        }
        else
        {
            System.out.println("nop");
        }
    }
}