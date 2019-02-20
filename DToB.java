import java.util.*;
import java.lang.Math.*;

public class DToB
{
    static int dtob(int n)
    {
        int d = 0;
        while(n>0)
        {
            d = d*10 + (n%2);
            n/=2;
        }
        return d;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(dtob(n));
    }
}