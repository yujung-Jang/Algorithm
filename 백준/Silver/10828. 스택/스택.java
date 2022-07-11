import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack st = new Stack();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (s.contains("push")) {
                String[] push = s.split(" ");
                st.push(Integer.parseInt(push[1]));
            }

            else if (s.equals("pop")) {
                if (st.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(st.pop());
                }
            }

            else if (s.equals("size")) {
                System.out.println(st.size());
            }

            else if (s.equals("empty")) {
                if (st.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }

            else if (s.equals("top")) {
                if (!st.isEmpty()) {
                    System.out.println(st.peek());
                } else {
                    System.out.println("-1");
                }
            }

        }

    }
}