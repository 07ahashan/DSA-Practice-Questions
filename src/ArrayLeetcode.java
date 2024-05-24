public class ArrayLeetcode {
    public static void main(String[] args) {
        int[] arrA={1,2,3,4,5};
        int[] arrB={1,2,3,4};
        int[] newArr=new int[arrA.length];


        for(int i=0;i<arrA.length;i++)
        {
            int count=0;
           for(int j=0;j<arrB.length;j++)
           {
               if(arrA[i]==arrB[j])
               {
                  count++;
               }
           }
           if(count==0)
           {
               newArr[i]=arrA[i];
           }
        }

        for (int i=0;i<newArr.length;i++)
        {
            System.out.print(newArr[i]+" ");
        }


    }
}
