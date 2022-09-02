class Solution {
    public String solution(String s, int n) {
        
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            
            //n을 더했을 때 'a' 혹은 'A'와의 거리 숫자를 구하고,
            //알파벳 범위를 벗어날 경우를 검증하기 위해 나머지 계산 후 'a' 혹은 'A'를 더해서 완성한다
            if (Character.isLowerCase(ch))
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            else if (Character.isUpperCase(ch))
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            
            result += ch;
        }
        
        return result;
    }
}