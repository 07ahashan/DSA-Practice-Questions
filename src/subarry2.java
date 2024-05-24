import java.lang.Math.*;

public class subarry2 {
    public static void main(String[] args) {
        int[] Arr={1,2,3,1,1,3};
        int target=5;
        // Using the concept of two pointer Array
        //left and right variable
        int left=0;
        int curr=0;
        int answer=0;

        for(int right=0;right<Arr.length;right++)
        {
            curr+=Arr[right];
            while(curr>target)
            {
                curr-=Arr[left];
                left++;
            }
            //right - left + 1: This calculates the length of the current subarray.
            //Math.max(answer, right - left + 1): This compares the length of the current subarray (right - left + 1) with the value of answer,


            answer = Math.max(answer, right - left + 1);
        }

        System.out.println(answer);

    }
}
