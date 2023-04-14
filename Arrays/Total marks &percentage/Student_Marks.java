import java.util.Scanner;

public class Student_Marks {
    public static void main(String[] args) {
        int sub, total = 0, percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total subjects:");
        sub = sc.nextInt();
        int marks[] = new int[sub];
        System.out.println("Enter marks out of 100:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        percentage = total / sub;
        System.out.println("Total Marks=" + total);
        System.out.println("Overall percentage is=" + percentage);
        sc.close();
    }
}
