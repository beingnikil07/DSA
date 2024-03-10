/**
 * jinki position ka sum even number aayega udhar humko 1 print karana hai aur
 * jidhar odd aaye udhar 0
 * that is the logic of this problem
 * 
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1
 * 
 * 
 * 
 */

public class BinaryPattern {
    public static void main(String[] args) {
        byte n = 5;
        for (byte i = 1; i <= n; i++) {
            for (byte j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }     

            }
            System.out.println();
        }
    }
}
