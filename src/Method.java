public class Method {
    public static void main(String[] args) {
        int a=10;
        value(a);
        System.out.println(a);

    }
    static int value(int a)
    {
        a+=5;
        System.out.println(a);
        a+=5;
        System.out.println(a);
        return 0;
    }
}
