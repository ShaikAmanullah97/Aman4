class A
{
    int x= 5;
    void show()
    {
        System.out.println("A class");
    }
    }
    class B extends A
    {
        int y=10;
        void print()
        {
            System.out.println("B class");
        }
            public static void main(String args[])
            {
                B b=new B();
                b.show();
                b.print();
                System.out.println(b.x);
                System.out.println(b.y);
            }
        }
