import java.util.Scanner;

//Mystery number 
//22 -> 11 + 11 // 11 is reverse of 2nd 11

public class Mnumber
{
    static boolean Reverse(int n1, int n2)
    {
        int dup=0;
        while(n2>0)
        {
            dup = dup*10 + n2%10;
            n2/=10;
        }
        if(dup==n1)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n/2;i++)
        {
            for(int j=n-1;j>0;j--)
            {
                if((i+j)<n)
                {
                    break;
                }
                else if((i+j)==n)
                {
                    if(Reverse(i,j))
                    {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }
}