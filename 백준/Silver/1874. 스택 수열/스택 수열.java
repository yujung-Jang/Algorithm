import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last = 0;

        while (n-- > 0) {
            int input = sc.nextInt();

            //입력된 값이 현재의 마지막 값보다 클 때
            if (input > last) {
                
                for (int j = last + 1; j <= input; j++) {
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                last = input;
            }

            //top의 원소가 입력받은 수와 같지 않을 때
            else if (stack.peek() != input) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);
    }
}
