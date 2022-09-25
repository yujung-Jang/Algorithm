import java.util.*;

class Solution {
    boolean solution(String s) {
        
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            //'('이면 push
            //')'이고, 스택 안에 요소가 있으면 pop, 없으면 false 반환
            if (s.charAt(i) == '(') {
                st.push("(");
            } else if (s.charAt(i) == ')' && !st.isEmpty()) {
                st.pop();
            } else {
                return false;
            }
        }

        //스택이 비어 있으면 true를 반환한다
        if (st.isEmpty()) return true;
        else return false;
    }
}