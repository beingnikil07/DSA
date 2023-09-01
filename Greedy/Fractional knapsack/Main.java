import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;
        double ratio[][] = new double[val.length][2];
        // 0th col ->index store
        // 1th col =>ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];

        }
        // Ascending order sorting,but i want decending so i will reverse the loop :)
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (capacity >= weight[index]) { // include full item
                finalVal = finalVal + val[index];
                capacity = capacity - weight[index];
            } else {
                // Include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value:" + finalVal);
    }
}