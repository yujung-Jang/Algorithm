import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine()); // 테스트 케이스

        for (int i = 0; i < testCase; i++) {

            Queue<Integer[]> q = new LinkedList<>(); // 프린터 대기열 { 인덱스, 문서(중요도) }

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); // 문서의 개수
            int M = Integer.parseInt(st.nextToken()); // Queue에서의 위치

            // 문서(중요도)를 프린터 대기열에 넣는다
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++)
                q.add(new Integer[]{ j, Integer.valueOf(st.nextToken()) });

            int count = 0; // 몇 번째로 인쇄되는지 카운트
            while (true) {

                Integer[] now = q.poll();
                boolean max = true; // 현재 문서(now)보다 더 중요도가 큰 문서가 있는지 판별

                for (Integer[] integers : q) {

                    // 현재 문서의 중요도보다 더 큰 중요도가 있다면 max를 false로 바꾸고 벗어난다
                    if (integers[1] > now[1]) {
                        max = false;
                        break;
                    }
                }

                // max가 true이면
                if (max) {
                    // count를 증가시키고
                    count++;
                    // 몇 번째로 인쇄되었는지 궁금한 문서라면 while문을 벗어난다
                    if (M == now[0]) break;
                } else {
                    // max가 false이면 중요도가 나중이므로 q의 뒤에 넣는다
                    q.add(now);
                }
            }

            System.out.println(count);
        }
    }
}
