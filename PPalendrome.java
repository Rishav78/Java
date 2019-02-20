import java.util.*;
public class PPalendrome
{
    static boolean Palendrome(int n)
    {
        int n1=n,n2=0;
        while(n1>0)
        {
            n2=n2*10 + n1%10;
            n1/=10;
        }
        if(n2==n)
        {
            return true;
        }
        return false;
    }
    static boolean Prime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for(int i=m+1;i<n;i++)
        {
            if(Prime(i) && Palendrome(i))
            {
                System.out.println(i);
            }
        }
    }
}