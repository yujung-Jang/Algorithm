import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int n = sc.nextInt();

        int price = 0;
        int item = 0;
        for (int i = 0; i < n; i++) {
            price = sc.nextInt();
            item = sc.nextInt();

            sum = sum - (price * item);
        }

        if (sum == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}