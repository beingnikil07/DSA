public class ButterflyPattern {
    public static void main(String[] args) {
        byte n=4;
        for(byte i=1;i<=n;i++){
            for(byte j=1;j<=i;j++){
                System.out.print("*");               
            }
        }
    }
}