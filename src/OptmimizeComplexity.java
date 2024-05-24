
//Try to find out the target value from the array items;

import  java.util.*;
public class OptmimizeComplexity {
    public static void main(String[] args) {
        int [] arr={5,2,3,4,78,554,1,69,85,4,65};
        int target= 8;
        Arrays.sort(arr);//Using the Arrays.sort method to direct sort the array with O(nlogn) time complexity.

        int left=0;//first pointer
        int right=arr.length-1;//second pointer

        while(left< right)//while loop is introduce compare the target value and print value or output
        {
            int sum=arr[left]+arr[right];
            if(target==sum)
            {
                System.out.println(arr[left] + " "+arr[right]);
                left++;
                right--;
            } else if (sum<target) {
                left++;
            }else
                right--;
        }
    }
}
