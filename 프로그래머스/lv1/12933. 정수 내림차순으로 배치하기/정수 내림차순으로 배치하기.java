import java.util.*;

class Solution {
    public long solution(long n) {
        
        String s = Long.toString(n);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(Character.getNumericValue(s.charAt(i)));
        }

        list.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }

        String result = sb.toString();

        return Long.parseLong(result);
        
    }
}