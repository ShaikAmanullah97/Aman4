class Demo
{
    {
        System.out.println("Block 1");
    }
    Demo()
    {
        System.out.println("constructor");
    }
    public static void main(String args[])
    {
        {
            new Demo();
        }
        {
            System.out.println("Block 2");
        }
    }
}

