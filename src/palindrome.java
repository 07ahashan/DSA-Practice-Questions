import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String A =sc.next();
        int count=0,n=0;
        for(int i=0;i<A.length()/2;i++){
            n=A.length();
            if(A.charAt(i)==A.charAt(n-1-i)){
                count++;
            }
        }
        if(count==n/2)
        {
            System.out.println("Yes");
        }else
        {
            System.out.println("No");
        }

    }
    }

