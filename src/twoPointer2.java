public class twoPointer2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int l=0,r=0;

        while(l<arr.length)
        {
            for(int i=l;i<=r;i++)
            {
                System.out.print(arr[i]+" ");
            }
            r++;
            System.out.println();
            if(r==arr.length)
            {
                l++;
                r=l;
            }
        }
    }
}
