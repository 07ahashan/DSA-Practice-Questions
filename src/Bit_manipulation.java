import java.util.Scanner;

public class Bit_manipulation {

//    there are four operation that use in bit_manipulation
    //1 get          2 set       3 clear      4 update

    //will write and all codes that how its works

    public static void get_Bit()
    {
        //logic used is :
        // first step is to apply left ot right shift accordingly and find bitmask
        //Second step is to find "AND operator" and store or print
        int n=10;  //1010
        int pos=1;
        int bit_mask=1<<pos;


        if((bit_mask & n)==0)
        {
            System.out.println("Bit was Zero");
        }else
        {
            System.out.println("Bit was One");
        }
    }

    public static void set_Bit()
    {

        //logic used is :
        // first step is to apply left ot right shift accordingly and find bitmask
        //Second step is to find "OR operator" and store or print
        int n=10;//1010
        int pos=2;
        int bit_mask=1<<pos;

        int newBit=bit_mask | n;
        System.out.println(newBit);
    }

    public static void clear_Bit()
    {
        //logic used is :
        // first step is to apply left ot right shift accordingly and find bitmask
        //Second step is to find "AND NOT operator" and store or print
        int n=15;//1010
        int pos=2;
        int bit_mask=1<<pos;

        int newBit=~bit_mask;
        System.out.println(newBit & n);

    }


    public static void Update_Bit()
    {
        //logic used is :
        // first step is to apply left ot right shift accordingly and find bitmask
        //Second step is to find "AND NOT operator for 0 , OR operator for 1" and store or print


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value 0 or 1:");
        int oper=sc.nextInt();
        int n=10;//1010
        int pos=3;
        int bit_mask=1<<pos;

        if(oper==0)
        {
            int not=~bit_mask;
            System.out.println(n & not);

        }else {
            int newBit = (bit_mask | n);
            System.out.println(newBit);
        }
    }


    public static void main(String[] args) {
        get_Bit();
        set_Bit();
        clear_Bit();
        Update_Bit();

    }
}
