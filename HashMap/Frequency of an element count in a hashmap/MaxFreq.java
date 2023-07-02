import java.util.HashMap;
import java.util.Map;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 8, 8, 2, 2, 1, 3, 2, 2 };
        Map<Integer, Integer> freq = new HashMap<>();
        // iterating array using for-each loop
        for (int e : arr) {
            if (!freq.containsKey(e)) {
                freq.put(e, 1);
            } else {
                freq.put(e, freq.get(e) + 1);
            }
        }
        System.out.println("frequency map:");
        System.out.println(freq.entrySet()); // traversing and print whole map
        int maxFreq = 0;
        int ansKey = -1;
        for (var e : freq.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        // // or you can iterate like this
        // for (var key : freq.keySet()) {
        //     if (freq.get(key) > maxFreq) {
        //         maxFreq = freq.get(key);
        //         ansKey = key;
        //     }
        // }
        System.out.printf("%d has maximum frequency it occurs %d times", ansKey, maxFreq);
    }
}
