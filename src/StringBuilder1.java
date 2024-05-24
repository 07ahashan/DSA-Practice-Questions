
public class StringBuilder1 {
    public static void main(String[] args) {
//       Append();
//        Reverse();
        Substring();
    }
    public static void Append()
    {
        StringBuilder Sb=new StringBuilder();
        Sb.append("Ahashan Ali");
        StringBuilder Sb1=new StringBuilder();
        Sb1.append("Ahashan__Ali");
        if(Sb1.compareTo(Sb)==0)
        {
            System.out.println(Sb);
        }else
        {
            System.out.println("Not Same");
        }
    }

    public static void Reverse()
    {
        StringBuilder Sb=new StringBuilder();
        Sb.append("NAMAN");
        StringBuilder Sb1=new StringBuilder();
        Sb1=Sb.reverse();
        if(Sb.compareTo(Sb1)==0)
        {
            System.out.println("Palindrome");
        }else
        {
            System.out.println("Not Same");
        }
    }

    public static void Substring()
    {
        StringBuilder Sb=new StringBuilder("Ahahsan ali");
        Sb.substring(1);
        StringBuilder Sb1=new StringBuilder("Here is the list of Substring form Starting index ");


    }
}
