import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str = "Sumit";
        Stack<Character> s1 = new Stack<>();

        String reverse = "";

        for (int i =str.length()-1; i >= 0; i--) {
            s1.push(str.charAt(i));
        }

        for (int i = 0; i < s1.size(); i++) {
            reverse += s1.elementAt(i);
        }

        System.out.println(reverse);
    }

}
