import java.util.*;
public class CreateP
{
    public static int checkp(Integer n)
    {
        int n2=n;
        int n1=0;
        while(n2>0)
        {
            n1 = n1*10 + n2%10;
            n2=n2/10;
        }
        if(n1==n)
        {
            return -1;
        }
        return n1;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        int count=0;
        while(checkp(n)!=-1)
        {
            n=n+checkp(n);
            count++;
        }
        System.out.println(n);
        System.out.println(count);
    }
}