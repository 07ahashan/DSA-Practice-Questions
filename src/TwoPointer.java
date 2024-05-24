import java.util.*;

public class TwoPointer {
    public static void main(String[] args) {
        TargetSum();
        mergeArray();
    }

    static  void palindrome()
    {
        String str="racecar";
        char[] c1=str.toCharArray();

        int left=0;
        int right=c1.length-1;
        while(left<c1.length)
        {
            if(c1[left]==c1[right])
            {
                left++;
                right--;
                continue;

            }else {
                System.out.println("Not palindrome String");
                break;
            }
        }
        for(int i=0;i<c1.length;i++)
        {
            System.out.print(c1[i]);
        }
    }


    static int TargetSum()
    {
        int[] nums = {1, 2, 4, 6, 8, 9, 14, 15};
        int target =13;

        int right=nums.length-1;
        int left=0;

        while(right>0)
        {
            if(nums[left]+nums[right]!=target)
            {
                left++;
                right--;
                continue;
            }else
            {
                System.out.println(left +"and"+ right);
                break;
//               return left;
            }
        }
        return 0;
    }

    static List<Integer> mergeArray()
    {
        int[] num1={1,5,8,9};
        int[] num2={2,3,10};
        List<Integer> ans = new ArrayList<>();

        int i=0,j=0;
        while(i<num1.length && j<num2.length)
        {
            if (num1[i] < num2[j]) {
                ans.add(num1[i]);
                i++;
            } else {
                ans.add(num2[j]);
                j++;
            }
        }

        while (i < num1.length) {
            ans.add(num1[i]);
            i++;
        }
        while (j < num2.length) {
            ans.add(num2[j]);
            j++;
        }

        return ans;
    }
}
