import java.util.*;
public class prime
{
    public static int prime(int n)
    {
        for(int j=2;j<n;j++)
            {
                if(n%j==0)
                {
                    return 0;
                }
            }
        return 1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count=0,i=2;
        while(count!=n)
        {
            if(prime(i)==1)
            {
                count++;
            }
            i++;
        }
        System.out.println(i-1);
    }
}