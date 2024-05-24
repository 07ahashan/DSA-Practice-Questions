public class Pattern1 {
    public static void main(String[] args) {

//        Pattern name: Half pyramids
//            *
//           **
//          ***
//         ****
//        *****

       /* int n=6;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }*/


//     Pattern name: Inverted Half pyramids
//     1 2 3 4 5
//     1 2 3 4
//     1 2 3
//     1 2
//     1

        /*int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();

        }*/



//     pattern name: floyd's Triangle
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15


        /*int n=5;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count + " ");
            }

            System.out.println();

        }*/


//     Pattern Name: 0-1 Triangle
//      1
//      0 1
//      1 0 1
//      0 1 0 1
//      1 0 1 0 1

      /*  int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                    System.out.print( 1 + " ");
                else
                    System.out.print(0 +" ");
            }

            System.out.println();

        } **/

//        PAttern name: Solid Rhombus
//                * * * * *
//              * * * * *
//            * * * * *
//          * * * * *
//        * * * * *

    /*    int n=6;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<n;j++)
            {
                System.out.print( "* ");
            }

            System.out.println();

        }
        */


        //Patern name:Palindronic Number pyramid

//                1
//               212
//              32123
//             4321234
//            543212345

  /*      int n=6;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<i;j++)
            {
                System.out.print(i-j);
            }

            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }

            System.out.println();

        } */

        //Pattern Name: Number Pyramid

//        *
//       * *
//      * * *
//     * * * *
//    * * * * *

        /* int n=6;
        for(int i=1;i<n;i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


         */

//Pattern Type : Adv. pattern

//    *      *
//    **    **
//    ***  ***
//    ********
//    ********
//    ***  ***
//    **    **
//    *      *

    /*    int n=5;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */

//        pattern type:Hollow Rhombus

//     *****
//    *   *
//   *   *
//  *   *
// *****

       /* int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<5;j++)
            {
                if(j==0 || j==n-1 || i==0 ||i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        */



        //pattern type : Diamand Shape

//                *
//               ***
//              *****
//             *******
//              *****
//               ***
//                *

        int n=4;
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<n-i;j++)
         {
             System.out.print(" ");
         }
         for(int j=0;j<i*2+1;j++)
         {
             System.out.print("*");
         }
         for(int j=n;j>i*2+1;j--)
         {
             System.out.print("*");
         }
         for(int j=0;j<n-i;j++)
         {
             System.out.print(" ");
         }
         System.out.println();

     }


    }
}
