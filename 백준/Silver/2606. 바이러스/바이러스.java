import java.util.*;

public class Main {

    static int node[][]; // 그래프 배열
    static int check[]; // 방문 배열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); // 컴퓨터 수
        int m = Integer.parseInt(sc.nextLine()); // 간선의 수

        node = new int[n + 1][n + 1];
        check = new int[n + 1];

        for (int i = 0; i < m; i++) { // 그래프

            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            node[a][b] = 1;
            node[b][a] = 1;
        }

        bfs(1);
    }

    static void bfs(int start) {

        Queue<Integer> q = new LinkedList<>();

        check[start] = 1;
        q.offer(start);

        int cnt = 0; // 감염된 컴퓨터 수

        while (!q.isEmpty()) {
            int x = q.poll(); // 시작 노드 -> 연결된 노드 -> ...

            for (int i = 1; i < node.length; i++) { // 1번과 연결된 컴퓨터를 찾아서 cnt 증가
                if (node[x][i] == 1 && check[i] != 1) { // 연결되어 있고, 방문한 곳이 아닐 때
                    q.offer(i); // Queue에 새로운 컴퓨터 추가
                    check[i] = 1; // 방문 체크
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
