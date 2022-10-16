import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 나이와 이름을 2차원 배열에 담는다
        String[][] arr = new String[N][2];
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st =new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        // 나이 순 정렬
        Arrays.sort(arr, (String[] a, String[] b) -> {
            return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
        });

        for (String[] strings : arr) {
            System.out.println(strings[0] + " " + strings[1]);
        }
    }
}
