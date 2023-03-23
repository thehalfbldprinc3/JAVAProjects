public class Main {

    static void Swap(int a,int b)
    {
        System.out.println("before swap: " +
                "a: "+a+" b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swap: " +
                "a: "+a+" b: "+b);

    }
    public static void main(String[] args)
    {
        Swap(20,30);
    }
}