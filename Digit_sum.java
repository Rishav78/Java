import java.util.*;
import java.lang.Math.*;

public class Digit_sum
{
    static int sum(int n)
    {
        int a=0;
        while(n>0)
        {
            a = a + n%10;
            n/=10;
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
}