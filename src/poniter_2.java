public class poniter_2 {
    public static void main(String[] args) {
        String str="absba";
        char[] c=str.toCharArray();
        char c1,c_last;

        for(int i=0;i<c.length/2;i++)
        {
           c1=c[i];
           c_last=c[c.length-1-i];
           if(c1==c_last)
           {
               continue;
           }
           else
           {
               System.out.println("Not palindrome");
               break;
           }

        }
    }
}
