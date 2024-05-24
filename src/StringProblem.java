public class StringProblem {
    public static void main(String[] args) {
        String s1="ABCD";
        String s2="BDAC";

        int sum=0;
        for(int i=0;i<s2.length();i++)
        {
            for(int j=0;j<s1.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    int diff=i-j;
                    if(diff<0)
                    {
                        diff*=-1;
                    }
                    sum+=diff;
                }
            }
        }
        System.out.println(sum);
    }
}
