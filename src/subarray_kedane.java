import java.util.TreeSet;

public class subarray_kedane {
    public static void main(String[] args) {
        int[] array={1,5,4,3};
        int n=5;

                int[] hash=new int[n];
                int res=0;

                for(int i=0;i<array.length-2;i++)
                {
                    hash[array[i]]++;
                }
                for(int i=0;i<hash.length-2;i++)
                {
//                    if(hash[i]==0)
//                    {
//                        res=i;
//                        break;
//                    }
                    System.out.println(hash[i]);
                }

            }

        }



