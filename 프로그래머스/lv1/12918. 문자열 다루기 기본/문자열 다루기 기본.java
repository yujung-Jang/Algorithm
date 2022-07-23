class Solution {
    public boolean solution(String s) {
        
        if(!(s.length() == 4 || s.length() == 6)) return false;
        
        try {
            int num = Integer.valueOf(s);
        } catch (Exception e) {
            return false;
        }
        
        return true;
    }
}