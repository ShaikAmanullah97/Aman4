class A
{
    A()
    {
        this(20);
        System.out.println("welcome");
    }
    A(int x)
    {
        System.out.println(x);
    }
}
class B extends A
{
    B()
    {
        this(40);
        System.out.println("java class");
    }
    B(int d)
    {
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        new B();
    }
}