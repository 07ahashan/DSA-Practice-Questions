import java.util.*;

public class SqaureSortedArrsy {
    public static void main(String[] args) {


        int[] arr={-1,-5,4,6};
        int[] newArr=new int[4];

        for(int i=0;i< arr.length;i++)
        {
            newArr[i]=arr[i]*arr[i];
        }
        Arrays.sort(newArr);
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(newArr[i] +" ");
        }
    }

}
