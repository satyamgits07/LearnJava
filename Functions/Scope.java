import java.util.*;
public class Scope {
    public static void main(String[] args) {
          int a=10;
          int b=20;
            String name= "Satyam";
          {
//           int a=78; // already initalised outside the block in the same method, hence you cannot initialize again
            a=100; // reassign the original reference variable to some other value
            System.out.println(a);
            int c=100;
            // values initialised in this block , will remain in block
         
            name="Prashant";
            System.out.println(name);
        }
          System.out.println(a);
          System.out.println(name);
        //   System.out.println(c); // cannot access outside the block

          //SCOPING IN FOR LOOPS

        for(int i=0; i<4; i++){
            System.out.println(i);
            int num=99;
//          int a=10;//already initalized, that's why we cannot use it in this block
            System.out.println(num);
            
            System.out.println(a);
        
        }
        
    }
}
