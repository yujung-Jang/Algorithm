class Solution {
    boolean solution(String s) {
        
        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == 'p') p++;
            if (s.charAt(i) == 'y') y++;
        }
        
        if ((p == 0 && y == 0) || p == y) return true;
        
        return false;
    }
}