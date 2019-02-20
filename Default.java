class Int
{
    protected int x;//BY DEFAULT ACCESS SPECIFIER IS DEFAULT
    public Int(int x)
    {
        this.x = x;
    }
}

public class Default
{
    public static void main(String[] args)
    {
        // static int x;
        Int a = new Int(5);
        System.out.println(a.x);
    }
}