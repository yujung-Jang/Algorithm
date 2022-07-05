import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && s.charAt(i) == 'c') {
                if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') {
                    i++;
                }
            }

            if (s.charAt(i) == 'd') {
                if (i < s.length() - 2 && s.charAt(i + 1) == 'z'&& s.charAt(i + 2) == '=') {
                    i += 2;
                }

                if (i < s.length() - 1 && s.charAt(i + 1) == '-') {
                    i++;
                }
            }

            if (s.charAt(i) == 'l' || s.charAt(i) == 'n') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }

            if (s.charAt(i) == 's' || s.charAt(i) == 'z') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }

            count++;
        }

        System.out.println(count);
    }
}