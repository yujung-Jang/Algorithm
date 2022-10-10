import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        // TestCase만큼 반복한다
        while (testCase-- > 0) {

            // Key를 의상의 종류, Value를 각 종류에 해당되는 옷의 개수로 하는 Map을 생성한다
            Map<String, Integer> map = new HashMap<>();

            int kindCase = Integer.parseInt(br.readLine());
            for (int i = 0; i < kindCase; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String kind = st.nextToken();
                // Map에 이미 담겨 있는 옷이 아니라면 Value를 1로 하고
                // 이미 담겨 있는 옷이라면 Value에 1을 더한다
                if (!map.containsKey(kind))
                    map.put(kind, 1);
                else
                    map.put(kind, map.get(kind) + 1);
            }

            // 각 의상 종류를 입는 경우의 수는 (옷의 개수 + 안 입는 경우)이다 
            Iterator<String> iterator = map.keySet().iterator();
            int multiplication = 1;
            while (iterator.hasNext()) {
                String key = iterator.next();
                multiplication *= map.get(key) + 1;
            }

            // 모든 종류를 통틀어 아무것도 안 입는 경우는 없으므로 아무것도 안 입는 경우의 수 1을 뺀다
            System.out.println(multiplication - 1);
        }
    }
}
