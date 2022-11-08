import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[201];

        String j = br.readLine();

        StringTokenizer st = new StringTokenizer(j, " ");
        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(st.nextToken()) + 100]++;
        }

        int input = Integer.parseInt(br.readLine());
        System.out.println(arr[input + 100]);
    }
}