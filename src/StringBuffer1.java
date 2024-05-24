import java.util.*;
import java.lang.*;

public class StringBuffer1 {
    public static void main(String[] args) {
//        declaration();
//        operation();
        substring();
    }


    public static void declaration() {
        //method 1 with default size 16
        StringBuffer sb = new StringBuffer();
        sb.append("Ahahshan ___Ali");

        //method 2 with direct decalration in the bufferString
        StringBuffer sb1 = new StringBuffer("Ahashan Ali");

        //method 3 define the size of the string in the bufferString
        StringBuffer sb2 = new StringBuffer(50);
        sb2.append("Ahashana ALi is a good boy.");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb2);
    }

    public static void reverse()
    {
        StringBuffer sb=new StringBuffer("madam");
        StringBuffer sb1=new StringBuffer();
        sb1.append(sb.reverse());
        if(sb.equals(sb1))
        {
            System.out.println("Palindrome");
        }
        System.out.println(sb1);
    }

    public  static void substring()
    {

    }

}
