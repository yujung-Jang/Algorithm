import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.printf("%d %d", fibonacci(n), n-2);
    }

    static int fibonacci (int n) {

        if (n == 1 || n == 2) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int[] arr = new int[100]; //메모이제이션, 기본값 0

    static int dp (int n) {

        if (n == 1 || n == 2) return 1;

        if (arr[n] != 0) return arr[n]; //기본값이 0이 아니면 이미 저장된 값 반환

        arr[n] = dp(n - 1) + dp(n - 2); //계산을 거치면 저장해 둔다
        return arr[n];
    }
}