import java.util.*;

public class Main {

    static int[][] field; // 배추 밭
    static boolean[][] visited;
    static int weight;
    static int height;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int t = 0; t < testCase; t++) {
            weight = Integer.parseInt(sc.next());
            height = Integer.parseInt(sc.next());

            field = new int[weight][height];
            visited = new boolean[weight][height];

            int K = Integer.parseInt(sc.next()); // 배추가 심어진 위치의 개수

            for (int i = 0; i < K; i++) {

                int x = Integer.parseInt(sc.next());
                int y = Integer.parseInt(sc.next());

                field[x][y] = 1; // 배추가 심어진 위치
            }

            int count = 0; // 지렁이 개수

            for (int i = 0; i < weight; i++) { // 영역이 나뉘어 있으므로 모든 좌표 검사
                for (int j = 0; j < height; j++) {

                    if (field[i][j] == 1 && !visited[i][j]) {
                        bfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
    }

    private static void bfs(int startX, int startY) {

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{startX, startY});
        visited[startX][startY] = true;

        int[] X = {0, 0, -1, 1};
        int[] Y = {1, -1, 0, 0};

        while (!q.isEmpty()) {

            int[] current = q.poll();

            for (int i = 0; i < 4; i++) {

                int x = current[0] + X[i];
                int y = current[1] + Y[i];

                if (x < 0 || x >= weight || y < 0 || y >= height) {
                    continue;
                }

                if (field[x][y] == 1 && !visited[x][y]) {
                    q.offer(new int[]{x, y});
                    visited[x][y] = true;
                }
            }
        }
    }
}
