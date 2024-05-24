import java.util.*;

public class Leet1 {
    public static void main(String[] args) {
        int[] arr={2,4,1,2};
        int k=3;
        int[] newArr=new int[arr.length];

        int ans=0;

        for(int i=0;i< arr.length-k+1;i++)
        {
            for(int j=i;j<k;j++)
            {
                newArr[j]+=arr[j];
            }
            Arrays.sort(newArr);

            newArr[i]=newArr[k-1]-newArr[0];
        }

        for(int i=0;i< newArr.length;i++)
        {
            System.out.print(newArr[i]+" ");
        }
    }
}
