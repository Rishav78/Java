import java.util.*;
public class Byte
{
    public static void main(String[] args)
    {
        // char r = 'r';
        // int f = r;
        Scanner scanner = new Scanner(System.in);
        byte a = (byte)scanner.nextInt();
        int[] b = new int[a];
        for(int i=0;i<a;i++)
        {
            b[i] = scanner.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            System.out.println(b[i]);
        }
    }
}/*bfdhvbhdfhvbfhvb */