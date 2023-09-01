/* Q: you are given 'n' activities with their start and end times .select the maximum number of activities that can
 * be performed by a single person,assuming that a person can only work on a single activity at a time .
 * Activities are sorted according to end time.
 * Example
 * start=[10,12,20]
 * end=[20,25,30]
 * answer=2(A0 and A2)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        // Sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Lambda function--short form of a big function
        // sorting of array activities column 2
        // sorting of 2D array
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        // End time basis sorting hai already
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // first activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum activities:" + maxAct);
        // to print
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println(); // new line
    }
}
