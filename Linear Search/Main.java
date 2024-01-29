import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums={};
        
        
        System.out.println(linearSearch2(nums, 10));
    }

    //Search the target and return true or false

//     static boolean linearSearch2(int[] arr, int target){
//         if(arr.length==0){
//             // System.out.println("array is empty");;
//             return false;
//         }
//         // run for loop
//         for (int element : arr) {
            
//             if(element==target){
//                 return true;
//             }
//     }

//     return false;
// }

    //search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if(arr.length==0){
            System.out.println("array is empty");;
        }
        // run for loop
        for (int index = 0; index < arr.length ; index++) {
            int element= arr[index];
            if(element==target){
                return element;
            }
    }

    return -1;
}


    // search in the array: return the index if item found
// otherwise if item not found return -1

    // static int linearSearch(int[] arr, int target){
    //     if(arr.length==0){
    //         System.out.println("array is empty");;
    //     }
    //     // run for loop
    //     for (int index = 0; index < arr.length ; index++) {
    //         int element= arr[index];
    //         if(element==target){
    //             return index;
    //         }
    // }

    // this line will execute if none of the return statements above have excuted
    // hence the target not found
    
   
//     return -1;
    
// }
}
