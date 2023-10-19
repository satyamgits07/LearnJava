import java.util.*;

public class Main {
    public static void main(String[] args){
        //syntax 
        /*
         datatype[] variable_name= new datatype[size];

         Why new here?

         --> "new"  is used to create an object  in a dynamic memory at run time.

          
         */
       // int[] Roll= new int[5];


    
         //or directly

        //  int[] Satyam= {23,45,23,24,67};
        //  System.out.println(Arrays.toString(Satyam));

        //  int[] ros; // declaration of array. ros is getting defined in the stack
        //  ros = new int[5]; //initialisation : actually here object is being created in the memory (heap)
        // System.out.println(ros[1]);

       
        String[] arr;
        arr = new String[4];
        System.out.println(arr[3]);  // null is only assigned in the non primitives , cannot be assigned in the primitives

          //  String a= null; // here null is working , becasue of non primitive datatype
        //int b= null; //Null cannot be used in primitives  data type
    }
}
 