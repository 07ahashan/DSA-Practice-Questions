import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Enter the year:");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
    // First method
      /* if(year%4==0)
        {
            if(year%100==0 && year%400!=0)
            {
                System.out.println("The given year not a leap year.");
            }else
            {
                System.out.println("LEAP YEAR!!!");
            }
        }else
        {
            System.out.println("The given year is not Leap year:");
        }
        */


    // Second method
        String val = ((year % 4 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))? "lEAP Year" : "Not a Leap year";

        System.out.println(val);

    }
}