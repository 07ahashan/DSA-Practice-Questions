import java.util.ArrayList;

public class Repition2D {
    public static void main(String[] args) {

        int[][] arr={{1,2},{3,3}};
        int[] hash=new int[4];

        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                hash[arr[i][j]-1]++;
            }
        }

        for(int i=0;i<4;i++) {
//            System.out.print(hash[i]+" ");
            if(hash[i]==2)
            {
                list.add(i+1);
            }
            if(hash[i]==0)
            {
                list.add(i+1);
            }
        }

        System.out.println(list);
    }
}
