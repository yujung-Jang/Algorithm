import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        Stack<String> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        String stick = sc.nextLine();
        int count = 0;

        st.push("("); //초기값
        for (int i = 1; i < stick.length(); i++) {
            if (stick.charAt(i) == '(')
                st.push("(");

            //레이저
            else if (stick.charAt(i - 1) == '(' && stick.charAt(i) == ')') {
                st.pop();
                count += st.size();
            }
            
            //마지막에는 레이저가 아닌 )에도 하나씩 더 나눠진다고 생각
            //예) 한 막대에 레이저 두 번 쏘면 세 부분으로 나눠짐
            else {
                st.pop();
                count++;
            }
        }

        System.out.println(count);
    }
}
