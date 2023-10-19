import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* ARRAYS OF PRIMITIVES
        -------------------------------------*/
          //int[] arr = new int[5];
        //  arr[0]=23;
        //  arr[1]=45;
        //  arr[2]=67;
        //  arr[3]=89;
        //  arr[4]=456;

    // [23, 45, 67, 89, 456] this is so lengthy to store one by one each value

        // System.out.println(arr[5]); // index out of bound error!!!!

        // Input using For Loops
        // for(int i=0; i< arr.length; i++){
        //     arr[i] = in.nextInt(); 
        // }

        //DIFFERENT WAYS TO PRINT THE ARRAY  (1)

    //     System.out.println(Arrays.toString(arr));

    //     //DIFFERENT WAYS TO PRINT THE ARRAY  (2)
    //     for(int i=0; i< arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //  }

            //DIFFERENT WAYS TO PRINT THE ARRAY  (3)

    //  for(int num : arr){ // for every element in array, print the element
    //     System.out.print(num +" "); // here num represents element of the array


    //  }
      /* ARRAYS OF OBJECTS 
       * -----------------------------------
       */
    String[] str = new String[5];
    for (int i =0; i<str.length; i++){
        str[i] = in.next();
    }
    System.out.println(Arrays.toString(str));
}
}
