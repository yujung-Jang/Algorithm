import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //인원 수
        int K = Integer.parseInt(st.nextToken()); //제거하는 번호

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        //큐를 생성하고 1부터 N까지의 수를 넣는다
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        //모두 제거될 때까지 반복한다
        while (!q.isEmpty()) {

            //K번째 위치의 요소를 제거하기 위해 그 앞에 있는 요소들을 뽑아서 뒤로 옮긴다
            for (int i = 1; i < K; i++) {
                Integer poll = q.poll();
                q.add(poll);
            }

            //각 K번째 수를 출력 형식에 맞게 뽑아 낸다
            if (q.size() != 1) sb.append(q.poll()).append(", ");
            else sb.append(q.poll()).append(">");
        }

        System.out.println(sb);
    }
}
