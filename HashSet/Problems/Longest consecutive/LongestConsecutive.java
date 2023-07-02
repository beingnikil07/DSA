import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }
        int maxStreak = 0;
        for (int num : st) {
            if (!st.contains(num - 1)) { // num is starting point of the sequence
                int currNum = num;
                int currStreak = 1; // length of current conscutive sequence
                while (st.contains(currNum + 1)) { 
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);

            }
        }
    }
}
