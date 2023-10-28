import java.util.*;
public class MultiDimension {
    public static void main(String[] args) {
        /*
         
            1 2 3 
            4 5 6 
            7 8 9

         */

         Scanner in = new Scanner(System.in);
        //int[][] arr= new int[3][];  // no of columns is not mandatory to add

        // int[][] arr = {
        //     {1, 2, 3},  //0th index
        //     {4, 5},      // 1st index
        //     {6, 7, 8, 9}  // 2nd index
        // };

        int[][] arr = new int[3][3];
          // input
          for(int row=0; row<arr.length;row++){
            //for each column in every row
            for(int col=0; col<arr[row].length;col++){
                arr[row][col]= in.nextInt();
            }
          }

          //Output method (1)
        //    for(int row=0; row<arr.length;row++){
        //     //for each column in every row
        //     for(int col=0; col<arr[row].length;col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        //   }

        //Output method(2)

        // for(int row=0; row<arr.length; row++){
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        //Output method(3)

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

        }
}
