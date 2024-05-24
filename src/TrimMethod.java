public class TrimMethod {
    public static void main(String[] args) {
        String s=" I m Ahashan Ali ";
        s=s.trim();
        System.out.println(s);
        char[] c1=s.toCharArray();
        int COUNT=0;
        for(int i=0;i<c1.length;i++)
        {
            if(c1[i]==' ')
            {
                COUNT=i;
            }
        }
        System.out.println(s.substring(++COUNT));

    }
}
