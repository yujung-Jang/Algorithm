import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr; //인접 행렬
    static boolean[] visited; //방문 여부 체크

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); //정점의 개수
        int M = Integer.parseInt(st.nextToken()); //간선의 개수
        int V = Integer.parseInt(st.nextToken()); //탐색을 시작할 정점의 번호

        //인접 행렬 생성하기
        arr = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            StringTokenizer nm = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(nm.nextToken());
            int b = Integer.parseInt(nm.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1; //양방향 간선이다
        }

        //방문 여부 기록
        visited = new boolean[N + 1];
        dfs(V);

        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }

    //재귀
    private static void dfs(int v) {

        visited[v] = true; //정점 v를 방문한 것으로 체크한다
        System.out.print(v + " ");

        if (v == arr.length) return; //마지막 정점까지 방문하면 재귀를 끝낸다

        for (int i = 1; i < arr.length; i++)
            //현재 정점을 탐색해서 다른 정점과 연결이 되어 있고 방문하지 않았다면
            //해당 정점을 현재 정점으로 하는 재귀를 실행한다
            if (arr[v][i] == 1 && !visited[i]) dfs(i);
    }

    //큐
    private static void bfs(int v) {

        Queue<Integer> q = new LinkedList<>();

        q.add(v); //탐색을 시작하는 정점 v를 큐에 넣는다
        visited[v] = true; //정점 v를 방문한 것으로 체크한다
        System.out.print(v + " ");

        while (!q.isEmpty()) { //큐에 정점이 존재하지 않을 때까지 반복한다
            int temp = q.poll(); //큐에서 정점 하나를 꺼내서 담는다

            for (int i = 1; i < arr.length; i++) { //정점의 개수만큼 탐색을 반복한다
                //현재 정점을 탐색해서 다른 정점과 연결이 되어 있고 방문하지 않았다면
                if (arr[temp][i] == 1 && !visited[i]) {
                    //큐에 연결된 정점을 담고 방문 체크 한다
                    q.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}