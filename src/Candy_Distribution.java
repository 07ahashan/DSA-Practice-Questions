public class Candy_Distribution {
    public static void main(String[] ali) {
        int n = 6;
        int[] arr = {5, 8, 7, 5, 5, 4};
        int count2 = 0, count3 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                count2++;
            }
            if (arr[i] % 3 != 0) {
                int rem = arr[i] % 3;
                count3 += 3 - rem;
            }


        }

        if (count2 < count3) {
            System.out.println(count2);
        } else
            System.out.println(count3);
    }

}



       /* int min=Integer.MAX_VALUE,candy=0,rem;

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>=arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for(int i=0;i<n;i++)
        {if(arr[i]==1)
            arr[i]+=1;
            candy++;
        }

        for(int i=2;i<=n;i++)
        {
            if(arr[0]%i==0)
            {
                min=i;
                break;
            }

        }


        for(int i=0;i<n;i++)
        {
            if(arr[i]%min!=0)
            {
                rem=arr[i]%min;
                candy+=min-rem;
            }

        }

        return candy;*/


