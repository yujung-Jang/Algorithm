import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        // 단어들을 입력받아서 배열에 넣는다
        for (int i = 0; i < N; i++)
            arr[i] = br.readLine();

        // 중복을 제거하기 위해 Set을 활용한다
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        String[] result = set.toArray(new String[0]);

        // Comparator를 이용하여 정렬 기준을 세운다
        Arrays.sort(result, (a, b) -> {
            if (a.length() == b.length()) // 원소가 서로 같을 경우
                return a.compareTo(b);
            return a.length() - b.length(); // 문자열 길이 오름차순 정렬
        });

        for (String s : result)
            System.out.println(s);
    }
}
