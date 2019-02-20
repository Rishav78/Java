import java.util.*;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a=0,b=1,sum;
        int n = scanner.nextInt();
        System.out.println(0);
        System.out.println(1);
        for(int i=2;i<n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(b);
        }
    }
}