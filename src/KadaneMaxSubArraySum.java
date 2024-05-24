public class KadaneMaxSubArraySum {
    public static void main(String[] args) {
        int[] arr={4,-2,0,3,-2,5};

        int sum=0;
        int max=arr[0];
        //This IS Known as KADANE'S algorithm
        //while solving this problem,it take the best time O(n) better than all others.
        //It had three basic concept that give the maximum sum of contiguous memory location
        //step 1:sum of array
        //step 2: Update the max
        //step 3: if sum is less then 0,update sum again with 0
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            max=Math.max(sum,max);

            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println(sum);
    }
}
