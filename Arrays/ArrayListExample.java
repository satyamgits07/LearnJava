import java.util.*;


public class ArrayListExample {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(4);

        ArrayList<String> Name = new ArrayList<>();

        // list.add(67);
        // list.add(57);
        // list.add(789);
        // list.add(1234);
        // list.add(67);
        // Name.add("Rahul");
        // System.out.println(Name);
        // System.out.println(Name.contains("Rahul"));

        // System.out.println("ArrayList: "+list);
    
        

        //System.out.println(list.contains(7));

       // list.set(1,990);  //change the element of the particular element
        // list.remove(2);
       // System.out.println("Changed list "+list);

       //INPUT
       for(int i=0; i<5;i++){
        list.add(sc.nextInt());
       }

       // get item at any index
       for(int i=0;i<5;i++){
        System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
       // System.out.println(list[i]); this will give error because in arrayList it will not work
    }

        
       
       System.out.println(list);
    
    }
}
