public class Array_Duplicate {
    public static void main(String[] args) {
        int[] arr={1,1,1,5,4,8,7,5,7,1,4,8,1};
        int[] newArr=new int[15];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(arr[j]==arr[i])
                {
                   newArr[i]=arr[j];
                }
                break;
            }

        }

        for(int i=0;i<newArr.length;i++)
        {
            System.out.println(newArr[i]);
        }


//        for(int i=0;i<newArr.length;i++)
//        {
//            System.out.println(newArr[i]);
//        }

    }
}
