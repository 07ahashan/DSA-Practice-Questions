public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height={4,2,0,3,2,5};
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];

        int max=0;
        for(int i=0;i<n;i++)
        {
            if(height[i]>max)
            {
                max=height[i];
            }
            left[i]=max;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(left[i]+",");
        }
        System.out.println();
        max=0;
        for(int i=n-1;i>=0;i--)
        {
            if(height[i]>max)
            {
                max=height[i];
            }
            right[i]=max;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(right[i]+",");
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.min(left[i],right[i])-height[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
