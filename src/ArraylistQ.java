import java.util.ArrayList;
import java.util.HashSet;

public class ArraylistQ {
    public static void main(String[] args) {
        char[] c={'s','w','a','g'};
        int[] nums={2,5,1,4,8,3};

        String str="Rizwan Alam";
        char[] c1=str.toCharArray();

//        ArrayList<Character> Char=new ArrayList<Character>();
//        ArrayList<Integer> Arr=new ArrayList<Integer>();

        HashSet<Integer> hash=new HashSet<Integer>();
        HashSet<Character> hashchar=new HashSet<Character>();
        HashSet<Character> hashchar1=new HashSet<Character>();


        for(int i=0;i<c.length;i++)
        {
            hashchar.add(c[i]);
        }
        for(int i=0;i<c1.length;i++)
        {
            hashchar1.add(c1[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            hash.add(nums[i]);
        }

        System.out.println(hashchar);
        System.out.println(hash);
        System.out.println(hashchar1);
    }
}
