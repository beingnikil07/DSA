import java.util.HashSet;

public class HashSetSTL {
    public static void main(String[] args) {
        // creation
        HashSet<String> st = new HashSet<>();
        st.add("Nikhil");
        st.add("Rakhi");
        st.add("Nikhil"); // duplicate
        System.out.println(st); // Nikhil ,Rakhi will be print !!
        System.out.println(st.contains("Rakhi")); // True
        System.out.println(st.size()); // 2
        st.remove("Nikhil");
        System.out.println(st.contains("Nikhil")); // false
        System.out.println(st.size()); // 1
        st.add("Anamika");
        // traversal
        for (String s : st) {
            System.out.println(s);
        }
    }
}