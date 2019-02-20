import java.util.*;
import java.lang.Math;

public class Perfect
{
    static boolean Check(int n)
    {
        int n2=n;
        int n1=0;
        for(int i=2;n2>0;i++)
        {
            if(n2%i==0)
            {
                n1+=i;
                n2/=i;
            }
        }
        if(n1==n)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sacnner = new Scanner(System.in);
        int n = sacnner.nextInt();
        int num=2;
        for(int i=0;i<n;)
        {
            if(Check(num))
            {
                System.out.println(num);
                i++;
            }
            num++;
        }
    }
}