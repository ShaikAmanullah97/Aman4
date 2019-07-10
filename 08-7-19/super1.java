class Demo
{
    int x= 10;
}
class test extends Demo
{
    int x= 20;
    void show()
    {
        int x= 15;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
    public static void main(String args[])
    {
        test t= new test();
        t.show();
    }
}