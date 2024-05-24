import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        concate();
    }

    public static void concate()
    {
        String UpdateArr="";

        String[] arr={"ahashan","ali","is","a","good","boy"};
        for(int i=0;i<arr.length;i++)
        {
            UpdateArr+=arr[i]+" ";
        }

        System.out.println(UpdateArr);

    }

}
