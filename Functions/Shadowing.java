import java.util.*;
public class Shadowing {
    static int x=90; // this will shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x); //90
      /*(this is declaration) */  int x; // the class variable at line 4 is shadowed by this
           // System.out.println(x);  scope will actually begin when value is initialised
      /*(this is intialization) */  x=40; // 
        
        System.out.println(x); //40
        fun();
        
    }
    static void fun(){
        System.out.println(x);
    }
    
}
