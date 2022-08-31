import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //입력값에 따른 경우의 수를 분석 -> 피보나치 수열
        int[] fibo = new int[1001];
        fibo[1] = 1;
        fibo[2] = 2;

        for (int i = 3; i <= n; i++)
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 10007;

        System.out.println(fibo[n]);
    }
}