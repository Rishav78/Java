import java.util.*;
import java.lang.Math.*;

public class Rotate
{
    static int rotate(int n)
    {
        String q = Integer.toString(n);
        int l = q.length();
        int p =n/(int)(Math.pow(10,l-1));
        l= n%(int)(Math.pow(10,l-1))*10 + p;
        System.out.println(l);
        return l;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int dup=n;
        do {
            dup = rotate(dup);
        } while (dup!=n);
    }
}