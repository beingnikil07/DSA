import java.util.Arrays;
import java.io.*;

public class Nik {
    public static void main(String[] args) {
        int Arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = Arrays.stream(Arr).sum();
        System.out.println(sum);
    }
}
