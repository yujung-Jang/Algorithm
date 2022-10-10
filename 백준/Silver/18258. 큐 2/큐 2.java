import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        LinkedList<Integer> q = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (test-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String act = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            switch (act) {
                case "push":
                    q.add(num);
                    break;
                case "pop":
                    if (!q.isEmpty()) sb.append(q.pop()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if (q.isEmpty()) sb.append("1").append("\n");
                    else sb.append("0").append("\n");
                    break;
                case "front":
                    if (!q.isEmpty()) sb.append(q.peek()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
                case "back":
                    if (!q.isEmpty()) sb.append(q.peekLast()).append("\n");
                    else sb.append("-1").append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }
}
