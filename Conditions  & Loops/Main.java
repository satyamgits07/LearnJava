import java.util.*;

public class Main {
    public static void main(String[] args){
        /*
           Syntax of if statements:
           if (boolean expression T or F){
            // body
           }    else {
            //do this
           }     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:-");
        int salary =sc.nextInt();
//              if (salary>10000){
//              salary += 2000;
//                  System.out.println("After bonus(2000):-" + salary);
//              } else {
//                  salary = salary+1000;
//                  System.out.println("After bonus(1000): "+ salary);
//              }

//             multiple if-else
            if ((salary>10000) && (salary<=20000)){
                salary += 2000; 
            } else if (salary > 20000){
                salary += 3000;
            } else {
                salary += 1000;
            }
            System.out.println(salary);


    }
    
}
