
public class TestThingsHW
{
    public void print(int x)
    {
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        int n = 13;
        TestThingsHW x=new TestThingsHW();
        print(n);
    }
    public static void falseSwap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main2(String[] args)
    {
        int x = 3;
        int y = 4;
        falseSwap(x, y);
        System.out.println(x+" "+y);
    }
}