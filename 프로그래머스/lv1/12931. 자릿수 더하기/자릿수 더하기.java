import java.util.*;

public class Solution {
    public int solution(int n) {
        
        String s = n + "";
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        
        return sum;
    }
}