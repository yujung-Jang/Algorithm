import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] alphabet = new int[26];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (alphabet[ch - 'a'] == -1)
                alphabet[ch - 'a'] = i;
        }

        for (int i : alphabet) {
            System.out.print(i + " ");
        }
    }
}