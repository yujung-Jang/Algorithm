import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        Deque<Integer> deque = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String act = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            switch (act) {
                case "push_front":
                    deque.addFirst(num);
                    break;
                case "push_back":
                    deque.addLast(num);
                    break;
                case "pop_front":
                    if (deque.isEmpty()) System.out.println("-1");
                    else System.out.println(deque.removeFirst());
                    break;
                case "pop_back":
                    if (deque.isEmpty()) System.out.println("-1");
                    else System.out.println(deque.removeLast());
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if (deque.isEmpty()) System.out.println("1");
                    else System.out.println("0");
                    break;
                case "front":
                    if (deque.isEmpty()) System.out.println("-1");
                    else System.out.println(deque.getFirst());
                    break;
                case "back":
                    if (deque.isEmpty()) System.out.println("-1");
                    else System.out.println(deque.getLast());
                    break;
            }
        }
    }
}
