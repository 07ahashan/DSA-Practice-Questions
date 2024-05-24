public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,4,5,8,8};

        int count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
               continue;
            }
            else
            {
                count++;
                System.out.print(arr[i]+" ");
            }

        }
        System.out.println("\n"+count);
    }
}
