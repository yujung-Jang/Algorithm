import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(stack(sc.next()));
        }
    }

    public static String stack(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                st.push(c);
            }

            else if (st.empty()) {
                return "NO";
            }

            else {
                st.pop();
            }
        }

        if (st.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}