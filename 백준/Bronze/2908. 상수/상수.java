import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        n1 = Integer.parseInt(new StringBuilder().append(n1).reverse().toString());
        n2 = Integer.parseInt(new StringBuilder().append(n2).reverse().toString());

        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }
}