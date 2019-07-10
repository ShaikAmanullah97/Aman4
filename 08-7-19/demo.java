class demo
{
    int x= 5;
}
    class test extends demo
    {
        int y=10;
        void print()
        {
            int z= 15;
            System.out.println(this.x);
            System.out.println(this.y);
            System.out.println(z);
        }
            public static void main(String args[])
            {
                test t = new test();
                t.print();
            }
    }
