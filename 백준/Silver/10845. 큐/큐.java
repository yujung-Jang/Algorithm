import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Queue<Integer> q = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int back = 0;

        for (int i = 0; i < n; i++) {

            String input = br.readLine();

            if (input.contains("push")) {
                String[] s = input.split(" ");
                back = Integer.parseInt(s[1]);
                q.add(back);
            }

            if (input.equals("pop")) {
                if (!q.isEmpty()) System.out.println(q.poll());
                else System.out.println("-1");
            }

            if (input.equals("size")) {
                System.out.println(q.size());
            }

            if (input.equals("empty")) {
                if (q.isEmpty()) System.out.println("1");
                else System.out.println("0");
            }

            if (input.equals("front")) {
                if (!q.isEmpty()) System.out.println(q.peek());
                else System.out.println("-1");
            }

            if (input.equals("back")) {
                if (!q.isEmpty()) System.out.println(back);
                else System.out.println("-1");
            }
        }
    }
}
