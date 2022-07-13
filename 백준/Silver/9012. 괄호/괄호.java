import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            sb.append(stack(br.readLine())).append("\n");
        }

        System.out.println(sb);
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