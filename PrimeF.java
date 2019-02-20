import java.util.*;
public class PrimeF
{
    public static boolean checkp(int n)
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
        int n = scanner.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0 && checkp(i))
            {
                System.out.println(i);
            }
        }
    }
}