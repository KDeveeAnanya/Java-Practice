
import java.util.*;
public class Hash_map {
    public static void main(String args[])
    {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"Java" );
        map.put(2,"DSA" );
        System.out.println(map);

        map.remove(1);
        System.out.println(map);

          System.out.println(map.get(2));
        
        //checking if a paticular key or a value exsists
          System.out.println(map.get(3));
          System.out.println(map.containsKey(3));
          System.out.println(map.containsValue("DSA"));

          //hashmap size
            System.out.println(map.size());

       }
//keys should be always unique, if taken same, the lastest value will overwrite the existing


       

}
