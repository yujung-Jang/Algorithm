import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0; //분수의 누적 수
        int cross = 1; //대각선 번호

        while (true) {

            if (n <= count + cross) { //입력된 수보다 분수의 누적 수가 커지면

                if (cross % 2 == 0) {
                    System.out.printf("%d/%d\n", n - count, cross - (n - count - 1));
                    break;
                } else {
                    System.out.printf("%d/%d\n", cross - (n - count - 1), n - count);
                    break;
                }
            } else {
                count += cross;
                cross++;
            }
        }
    }
}

