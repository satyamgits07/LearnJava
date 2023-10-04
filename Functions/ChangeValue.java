import java.util.*;
public class ChangeValue {
    public static void main(String[] args){

        // Create an array....
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;
        nums[1]=23; // if you make a change in the objects via this reference variable, same object will be changed
    }
}
