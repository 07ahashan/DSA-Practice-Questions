import java.util.*;

class PowerOf2 {
    public static void main(String[] args) {

        check();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();

        int count=0;
        while(num>0)
        {
            if(num%2==0) {
                int q = num / 2;
                num = q;
                count++;
            }else
                break;;
        }
        if(num==1)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println("Not Acceptable.");
        }
    }

    static void check()
    {
        //constant time complexity
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if((n&n-1)==0)
            System.out.println("True");
        else
            System.out.println("false");
    }
}
