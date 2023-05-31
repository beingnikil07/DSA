public class Reverse {
    public static void main(String[] args) {
        String str="NIKHIL";
        //initialize an object of stringBuffer class
        StringBuffer sb=new StringBuffer(str);
        //stringBuffer class provides a reverse() method
        sb.reverse();
        //convert the stringBuffer to string using toString() method
        System.out.println(sb.toString()); 
    }    
}
