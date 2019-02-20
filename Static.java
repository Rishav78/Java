class parent
{
    public static int a;
}
class child extends parent
{}
public class Static
{
    public static void main(String[] args) {
        child.a=12;
        System.out.println(parent.a);
    }
}