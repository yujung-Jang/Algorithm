import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];
        int money = 0;
        
        //배열 coin에 동전 가치를 오름차순으로 넣는다
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        //잔액 k가 0원이 될 때까지 반복한다
        while (k != 0) {
            for (int i = coin.length - 1; i >= 0; i--) {
                if (k >= coin[i]) {
                    money += k / coin[i];
                    k %= coin[i];
                }
            }
        }

        System.out.println(money);
    }
}