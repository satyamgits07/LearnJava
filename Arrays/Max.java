import java.util.*;
public class Max {
    public static void main(String[] args) {
        int[] arr={12, 23, 56, 765, 22, 789, 897};
       //System.out.println(max(arr));
       System.out.println(maxRange(arr,0,6));
    }
    // Imagine that arr is not empty

//     static int max(int[] arr){
//      if(arr == null || arr.length=0){
//           return -1;
  //          }
//         int maxVal = arr[0];
//         for(int i=1;i<arr.length;i++){
//             if (maxVal<arr[i]){
//                 maxVal=arr[i];
//             }
//         }
//             return maxVal;
    
//     }
// }

// work on edge cases here, like array being null

    static int maxRange(int[] arr, int index1, int index2){

    //Examples:-    if (index2 > index1){
        //     return -1;
        // }

        // if (arr == null){
        //     return -1;
        // }

        int maxVal = arr[index1];
        for(int i=index1;i<=index2;i++){
            if (maxVal<arr[i]){
                maxVal=arr[i];
               
            }
        }
            return maxVal;
            
    
    }
}
