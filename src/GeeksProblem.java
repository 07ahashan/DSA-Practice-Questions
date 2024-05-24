import java.util.*;
public class GeeksProblem {
    public static void main(String[] args) {

        int arr1[] = {2, 2, 3, 4, 5};
        int arr2[] = {1, 1, 2, 3, 4};
        ArrayList<Integer> list=new ArrayList<Integer>();

        HashSet<Integer> hash=new HashSet<Integer>();

        int n=arr1.length+arr2.length;

        for(int i=0;i<arr1.length;i++)
        {
            hash.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++)
        {
            hash.add(arr2[i]);
        }
        list.addAll(hash);
        System.out.println(list);

//        return list;

    }
}
