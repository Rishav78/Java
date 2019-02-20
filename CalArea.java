import java.util.*;
class Area
{
    float area(int n)
    {
        return n*n;
    }
    float area(float l, float b)
    {
        return l*b;
    }
    float area(float n)
    {
        return 3.14f*n*n;
    }
}
public class CalArea
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        float n1 = scanner.nextFloat();
        Area obj = new Area();
        System.out.println("Area of Rectangle " + obj.area(n,n1));
        System.out.println("Area of Circle " + obj.area(n1));
        System.out.println("Area of Square " + (int)obj.area(n));

    }
}