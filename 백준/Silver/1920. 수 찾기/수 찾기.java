import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // Test Case

        // Test Case 값들을 Map에 담는다
        Map<String, Integer> map = new HashMap();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num; i++) {
            map.put(st.nextToken(), i);
        }

        // 각 숫자들이 Map에 존재하는지 검사한다다
       int num2 = Integer.parseInt(br.readLine()); // Test Case 2
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num2; i++) {
            if (map.containsKey(st.nextToken())) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}