import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 좌표를 2차원 배열에 담기
        int[][] arr = new int[N][2];
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 정렬
        Arrays.sort(arr, (int[] a, int[] b) -> {
            if (a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];
        });

        StringBuilder sb = new StringBuilder();
        for (int[] ints : arr)
            sb.append(ints[0]).append(" ").append(ints[1]).append("\n");

        System.out.println(sb);
    }
}
