import java.util.*;
class C
{
    private int r,i;
    public C()
    {
        r=0;
        i=0;
    }
    public C(int r, int i)
    {
        this.r = r;
        this.i = i;
    }
    C add(C obj)
    {
        C ob = new C();
        ob.r = r + obj.r;
        ob.i = i + obj.i;
        return ob;
    }
    void p()
    {
        System.out.println(r + "+" + i + "i");
    }
}
public class Complex
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r,i;
        r = scanner.nextInt();
        i = scanner.nextInt();
        C ob1 = new C(r,i);
        r = scanner.nextInt();
        i = scanner.nextInt();
        C ob2 = new C(r,i);
        C ob3 = ob1.add(ob2);
        ob3.p();
    }
}