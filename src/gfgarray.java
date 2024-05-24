public class gfgarray {
    public static void main(String[] args) {
       int array[] = {10,7,6 ,1 ,4 ,10 ,5 ,2 ,7 ,5 ,3 ,3 ,8 ,3 ,8};
        int a=5,b=5;

        int temp=0;
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]==a)
//            {
//                temp=arr[0];
//                arr[0]=a;
//                arr[i]=temp;
//            }
//            if(arr[i]==b)
//            {
//                temp=arr[1];
//                arr[1]=b;
//                arr[i]=temp;
//            }
//        }

        for(int i=0;i<array.length;i++)
        {

            if(array[i]==a)
            {
                temp=array[0];
                array[0]=a;
                array[i]=temp;
            }

        }

        for(int i=1;i<array.length;i++)
        {
            if(array[i]==b)
            {
                temp=array[1];
                array[1]=b;
                array[i]=temp;
            }
        }


        for(int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
