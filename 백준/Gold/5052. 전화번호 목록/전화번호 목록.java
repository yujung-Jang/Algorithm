import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        // 입력받은 testCase만큼 반복한다
        while (testCase-- > 0) {

            // 전화번호를 입력받아서 배열과 map에 담는다
            int numberCase = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>();
            String[] phoneNumber = new String[numberCase];
            for (int i = 0; i < numberCase; i++) {
                String num = br.readLine();
                map.put(num, i);
                phoneNumber[i] = num;
            }

            // 각 번호의 일부들과 일치하는 Map의 Key가 있는지 검사한다
            boolean consistency = true;
            all:for (int i = 0; i < phoneNumber.length; i++) {
                for (int j = 0; j < phoneNumber[i].length(); j++) {
                    if (map.containsKey(phoneNumber[i].substring(0, j))) {
                        consistency = false; // 어떤 번호의 일부에 해당하는 번호가 있으면 false로 기록
                        break all; // 더 반복할 필요가 없으므로 for문을 빠져나간다
                    }
                }
            }

            if (consistency) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
