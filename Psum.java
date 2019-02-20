import java.util.*;
public class Psum
{
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
    static void Check(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(!Prime(i))
            {
                continue;
            }
            for(int j=2;j<n;j++)
            {
                if(Prime(j))
                {
                    if((i+j)==n)
                    {
                        System.out.printf("%d %d\n",i,j);
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Check(n);
    }
}