import java.util.*;
    public class StringExample {
        public static void main(String[] args) {
                // String msg =greet();
                // System.out.println(msg);
            Scanner in= new Scanner(System.in);
            System.out.print("Enter your name: ");
            String a = in.nextLine();
                String personalised = myGreet(a);
                System.out.println(personalised);
    }

     static String myGreet(String name) {
        String msg="hello " + name;
        return msg;
     }


    static String greet(){

        String greeting="How are you?";
        return greeting;
    }
    }
