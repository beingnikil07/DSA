public class Test {
    static String toUpperCase(String str)
    {
        //initialize an object of string builder class
        StringBuilder sb=new StringBuilder("");
        //initialize first letter of a word as capital 
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str="hii,i am nikil";
        System.out.println(toUpperCase(str));

    }
}
