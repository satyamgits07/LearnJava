import java.util.*;
public class MaxIn2Darray {
    
    public static void main(String[] args) {
        int[][] arr={
            {23,45,1,56},
            {45,2,45,12},
            {11,2}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                
                }
            }
        }
        return max;
    }

    
}
