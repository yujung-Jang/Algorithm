import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] chess = { 1, 1, 2, 2, 2, 8 };
        int[] input = new int[6];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 0; i < chess.length; i++) {
            System.out.println(chess[i] - input[i]);
        }
    }
}