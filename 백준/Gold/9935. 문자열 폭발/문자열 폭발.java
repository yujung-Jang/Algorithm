import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String origin = br.readLine(); // 문자열
        String explosives = br.readLine(); // 폭발 문자열

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < origin.length(); i++) {

            // 원본 문자열을 하나씩 스택에 넣는다
            st.add(origin.charAt(i));//hilovehello -> love
            // 스택의 길이가 폭발 문자열의 길이 이상이 될 경우
            if (st.size() >= explosives.length()) {
                // 폭발 문자열을 포함하는지 검사한다
                boolean check = true;
                for (int j = 0; j < explosives.length(); j++) {
                    if (st.get(st.size() - explosives.length() + j) != explosives.charAt(j)) {
                        check = false;
                        break;
                    }
                }

                // 폭발 문자열을 포함한다면 스택에서 제거한다
                if (check) {
                    for (int j = 0; j < explosives.length(); j++) {
                        st.pop();
                    }
                }
            }
        }

        //Stack에 담긴 문자열을 출력한다
        StringBuilder sb = new StringBuilder();
        
        if (st.isEmpty()) System.out.println("FRULA");
        else {
            for (Character character : st)
                sb.append(character);
            System.out.println(sb);
        }
    }
}
