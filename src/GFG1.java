import java.util.*;

public class GFG1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Loop:  ");

        int r=sc.nextInt();
        String s="11001";

        char[] ch=s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i]=='1')
                {
                    ch[i]='1'+'0';
                }else
                {
                    ch[i]='0'+'1';
                }
            }
            for(int i=0;i<ch.length;i++)
            {
                System.out.println(ch[i]);
            }

    }
}

//import java.util.*;
//
//public class GFG1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Loop: ");
//
//        int r = sc.nextInt();
//        String s = "11001";
//
//        char[] ch = s.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i] == '1') { // Corrected: Use single quotes for character literals
//                ch[i] = '0';     // Corrected: Assign character '0'
//            } else {
//                ch[i] = '1';     // Corrected: Assign character '1'
//            }
//        }
//        String str = String.valueOf(ch); // Corrected: Use String.valueOf(ch) to convert char array to String
//        System.out.println(str);
//    }
//}

