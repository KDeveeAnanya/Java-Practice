package Array_List;
import java.util.*;
public class Array_List {

    public static void main(String args[])
    {
        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(30);
        nums.add(20);
        nums.add(150);
    
        for(int i=0;i<nums.size();i++)
        {
            System.out.println(nums.get(i));
        }
            nums.set(0,100);
            System.out.println(nums.get(0));
            nums.remove(0);
        for(int i=0;i<nums.size();i++)
        {
            System.out.println(nums.get(i));
        }
            Collections.sort(nums);
        // nums.clear(); -- clears the array list, In array list elements can be added and removed
        }
}
