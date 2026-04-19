import java.util.*;

public class HashMap_Sum2 {
    public static void main(String args[]) {

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Ananya", 10);
        marks.put("Tosh", 20);
        marks.put("Mani", 30);
        marks.put("Sidvi", 40);

        // Update
        marks.put("Tosh", 25);

        // Print 
        for (String name : marks.keySet()) {
            System.out.println(name + " -> " + marks.get(name));
        }

        // Get value
        System.out.println("Mani marks: " + marks.get("Mani"));

        // Remove
        marks.remove("Ananya");

        // Check existence
        if (marks.containsKey("Tosh")) {
            System.out.println("Tosh exists");
        }
    }
}