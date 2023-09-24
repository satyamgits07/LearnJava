import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1: 
             System.out.println("Satyam jain");
             break;
            
            case 2:
            System.out.println("Prashant kumar");
            break;

            case 3:
            System.out.println("");
                switch (department){
                    case "IT" :
                        System.out.println("IT department");
                        break;
                    case "Management":
                    System.out.println("Management Department");
                    break;
                    default: 
                    System.out.println("no department entered");
                }
                break;
        
            default:
            System.out.println("Enter correct EmpID");
                break;
        }
    }
}
