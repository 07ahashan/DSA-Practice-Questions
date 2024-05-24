public class recusion {
    static int sum=0;
    static int Add(int n)
    {
        if(n>=1)
        {
           sum+=n;
           n--;
           Add(n);
        }
        return sum;
    }

    static void print(int n)
    {
        if(n>=1)
        {
            System.out.print(n+" ");
            n--;
            print(n);
        }
    }


    public static void main(String[] args) {
//        int res=Add(10);
//        System.out.println(res);
//
//               OR
//        System.out.println(Add(10));
        print(10);

    }
}
