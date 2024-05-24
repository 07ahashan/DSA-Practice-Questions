public class Target {
    public static void main(String[] args) {
        int[] nums={-1,-2,-3,-4,-5};
        int target=-8;
        int left=0;
        int right=left+1;

        while(left<right)
        {
            if(nums[left]+nums[right]==target)
            {
                System.out.println(left+"+"+right);
                break;
            }else {
                right++;
            }
            if(right==nums.length)
            {
                left++;
                right=left+1;
            }

        }
    }
}
