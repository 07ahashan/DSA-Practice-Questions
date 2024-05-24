public class mergeArray {
    public static void main(String[] args) {

        int[] Array1={1,2,32,4,5};
        int[] Array2={11,22,33,44,55};

        int i=0;
        int size=Array1.length+Array2.length;
        int[] newArray=new int[size];

            for (int j=0;j<Array1.length;j++)
            {
                newArray[i]=Array1[j];
                i++;
            }
            for (int k=0;k<Array2.length;k++)
            {
                newArray[i]=Array2[k];
                i++;
            }

            for (int j=0;j<size;j++)
            {
                System.out.print(newArray[j]+" ");
            }
    }
}
