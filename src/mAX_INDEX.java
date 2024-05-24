public class mAX_INDEX {
    public static void main(String[] args) {
        int []arr={1,10};
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]<=arr[j])
                {
                   if(max<j-i)
                   {
                       max=j-i;
                   }
                }
            }
        }

        System.out.println(max);

    }
}
