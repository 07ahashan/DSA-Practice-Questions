import java.util.Scanner;
import java.lang.Math;

public class Powerof3 {
    public static void main(String[] args) {
        cube();

    }
    public static void cube()
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if((int)Math.pow(3,19)%num==0)
        {
            System.out.println("NUmber is power of 3");
        }else
        {
            System.out.println("Not");
        }
    }

    public static void Checkcube()
    {

    }

}
