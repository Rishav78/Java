import java.util.*;

public class GCD
{
    public static int min(int n1, int n2)
    {
        if(n1<n2)
        {
            return n1;
        }
        return n2;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int G=0;
        for(int i=min(n1,n2);i>=1;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}