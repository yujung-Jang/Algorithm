import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray(); // 문자열을 문자 배열로 바꾼다
        Arrays.sort(arr); // 정렬

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}
