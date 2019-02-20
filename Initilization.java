class R
{
    private int a;
    {
        System.out.println("Hello World");
    }
    public R()
    {}
    public R(int a){}
    public R(int a, int b){}
}

public class Initilization
{
    public static void main(String[] args) {
        R obj = new R();
        R obj1 = new R(1);
        R obj2 = new R(1,2);
    }
}