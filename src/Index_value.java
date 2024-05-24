
//Finding the smallest index value of the repeated value from the array.
public class Index_value {
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 5, 4, 2, 7, 8, 2, 1, 9};
        for (int i = 1; i <= arr.length; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.println("The Smallest repeated index value : " + j);
                    System.out.println("The value is : " + arr[i]);
                    break;
                }
                break;
            }
            break;
        }
    }
}
