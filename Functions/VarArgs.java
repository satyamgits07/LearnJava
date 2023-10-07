import java.util.*;
public class VarArgs {
    public static void main(String[] args) {
        
        // fun(34,54,"Satyam", "Rahul");  //first one
        // fun(1,4,6,8,97,64,35,35,23,78,5);    //second one

        // demo(45,334,2,45,32);
        demo("Rahul", "Satyam");
              
    }

        static void demo(int ...v){
                System.out.println(Arrays.toString(v));
                
        }

         static void demo(String ...v){
            System.out.println(Arrays.toString(v));
        }


    static void fun(int a, int b, String ...v ){  // multiple arguments we can use & variable length argument can only use at last of the multiple arguments.
       System.out.println("First one");
       System.out.println(a+ " " + b+ " " );
       for (String name : v){

       System.out.println(name);}
    }

    static void fun(int ...v) // int ...any variable a,v,x,this will   help to take any input in the array
    {
        System.out.println(Arrays.toString(v));
        System.out.println("second one");
    }
    
}
