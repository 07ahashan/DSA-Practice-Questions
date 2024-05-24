import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {

        subString();

    }

    public static void subString() {
        String smallest="";
        String largest="";


        String s = "welcometojava";
        int k = 3;
        String[] arr = new String[s.length()-2];
        for (int i = 0; i < s.length()-k+1; i++) {
            arr[i] = s.substring(i, i + k);
        }

//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }

        smallest = arr[0];
        largest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(smallest)>0)
            {
                smallest=arr[i];
            }
            if(arr[i].compareTo(largest)<0)
            {
                largest=arr[i];

            }
        }

        System.out.println("Smallest String:"+smallest);
        System.out.println("Largest String:"+largest);
    }
}
