import java.util.Arrays;
import java.util.Scanner;

public class javafrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter The value of String:");
        String S1=sc.nextLine();
        System.out.println("Enter the value of String:");
        String S2=sc.nextLine();

        char[] R= S1.toLowerCase().toCharArray();
        char[] G= S2.toLowerCase().toCharArray();

        Arrays.sort(R);
        Arrays.sort(G);
        if(S1.length()!=S2.length()){
            System.out.println("False");
        }

        int count=0;
        if(S1.length()==S2.length())
        {
            for(int i=0;i<R.length;i++)
            {
                if(R[i]==G[i])
                {
                    count++;
                }
            }
        }
        if(count ==S1.length())
        {
            System.out.println("true");
        }
    }
}
