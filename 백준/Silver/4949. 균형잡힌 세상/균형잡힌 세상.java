import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;
        while (true) {
            s = br.readLine();

            if (s.equals(".")) //입력의 종료 조건
                break;

            sb.append(solution(s)).append("\n");
        }

        System.out.println(sb);
    }

    public static String solution(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            //열린 괄호라면 스택에 push 한다다
            if (c == '(' || c == '[')
               st.push(c);

            //')'일 때, 스택이 비어 있지 않고 이전 괄호가 '('이어야 짝이 맞으므로 pop
            else if (c == ')') {
                if (!st.isEmpty() && st.peek().equals('('))
                    st.pop();
                else
                    return "no";
            }

            //']'일 때, 스택이 비어 있지 않고 이전 괄호가 '['이어야 짝이 맞으므로 pop
            else if (c == ']') {
                if (!st.isEmpty() && st.peek().equals('['))
                    st.pop();
                else
                    return "no";
            }
            
            //이외 괄호가 아닌 문자는 넘어간다
        }

        //스택이 비어 있다면 괄호가 모두 매칭되었다는 의미이다
        if (st.isEmpty())
            return "yes";
        else
            return "no";
    }
}
