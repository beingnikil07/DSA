/**  Character Pattern
 * A
 * B C
 * D E F
 * G H I J
 * K L M N O
 * 
 */

public class CharacterPattern {
    public static void main(String[] args) {
        char ch=65;
        byte n=5;
        for(byte i=1;i<=n;i++){
            for(byte j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        
    }
}
