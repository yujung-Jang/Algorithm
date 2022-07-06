import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (check() == true) {
                count++;
            }
        }

        System.out.println(count);

    }

    public static boolean check() {
        boolean[] check = new boolean[26];
        int pre = 0;
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i);

            if (pre != now) {
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    pre = now;
                }

                else {
                    return false;
                }
            }

            else {
                continue;
            }
        }

        return true;
    }
}
