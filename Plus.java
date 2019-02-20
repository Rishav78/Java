import java.util.*;
import java.lang.Math;
public class Plus
{
    static int plus(int n)
    {
        String a = Integer.toString(n);
        int l = a.length();
        int p = 0;
        while(l--!=0)
        {
            p = p + (int)Math.pow(10,l);
        }
        return (n+p);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(plus(n));
    }
}