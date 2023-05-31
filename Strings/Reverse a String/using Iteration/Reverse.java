public class Reverse {
    public static void main(String[] args) {
        String originalStr="NIKHIL";
        String reversedStr="";   //initialize empty initially
        System.out.println("Original String:"+originalStr);
        for(int i=0;i<originalStr.length();i++)
        {
            reversedStr=originalStr.charAt(i)+reversedStr;
        } 
        System.out.println("Reversed string:"+reversedStr);
    }    
}
