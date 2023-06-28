import java.util.HashMap;
import java.util.Map;

public class HashOp {
    static void hashMapMethods() {
        // Syntax
        HashMap<String, Integer> obj = new HashMap<>();
        // Adding Elements
        obj.put("Nikhil", 21);
        obj.put("Ritik", 18);
        obj.put("Sunita", 45);
        obj.put("Sanjay", 45);
        // Getting value of a key from HashMap
        System.out.println(obj.get("Ritik")); // 18
        System.out.println(obj.get("Priya")); // null
        // changing/Updating value of a key in HashMap
        obj.put("Nikhil", 25);
        System.out.println(obj.get("Nikhil")); // 25
        // Removing a pair from the HashMap
        System.out.println(obj.remove("Ritik")); // 18
        System.out.println(obj.remove("Anamika")); // null
        System.out.println(obj);
        // Checking if a key is in the HashMap
        System.out.println(obj.containsKey("Ritik")); // false
        System.out.println(obj.containsKey("Nikhil")); // True
        // Adding a new entry only if the new key doesn't exist already
        obj.putIfAbsent("Nikhil", 20); // will not insert becz key is already in HashMap
        obj.putIfAbsent("Rakhi", 18); // will insert becz key is not present in hashMap
        System.out.println(obj);
        // Get all keys in the HashMap
        System.out.println(obj.keySet());
        // Get all values in the HashMap
        System.out.println(obj.values());
        // Get all Entries in the HashMap
        System.out.println(obj.entrySet());
        // Traversing all entries of HashMap -Multiple methods
        // 1. Method 1 using for-each loop
        for (String key : obj.keySet()) {
            System.out.printf("Age of %s is %d\n", key, obj.get(key));
        }
        System.out.println(); // new line
        // 2. Method 2 using Map interface mathod
        for (Map.Entry<String, Integer> e : obj.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println(); // For new Line
        // method 3 using entrySet() method in for-each loop
        for (var e : obj.entrySet()) {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

    }

    public static void main(String[] args) {
        hashMapMethods();
    }
}