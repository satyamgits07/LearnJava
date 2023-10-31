import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 8, 18};
        //swap(arr, 1, 3);
        Reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void Reverse(int[] arr){
        int index1=0;
        int index2=arr.length-1;

        while(index1<index2){
            //swap the elements at start and end of array
            swap(arr, index1, index2);
            index1++;
            index2--;
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp= arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
