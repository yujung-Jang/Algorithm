import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //a층의 b호에 살려면 (a-1)층 1호 ~ b호까지의 사람들의 수를 새로 데려와야 한다
        //양의 정수 k와 n에 대해 k층의 n호에는 몇 명이 살고 있는가?
        //0층, 1호부터 존재하며 0층 i호에는 i명이 산다

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int c = 0; c < testCase; c++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int[][] apt = new int[15][15];

            for (int i = 1; i < 15; i++) {
                apt[i][1] = 1;
                apt[0][i] = i;
            }

            for (int i = 1; i <= 14; i++) {
                for (int j = 2; j <= 14; j++) {
                    apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
                }
            }

            System.out.println(apt[k][n]);
        }
    }
}

