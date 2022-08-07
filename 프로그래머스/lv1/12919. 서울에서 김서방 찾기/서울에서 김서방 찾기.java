class Solution {
    public String solution(String[] seoul) {
        
        int result = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim"))
                result = i;
        }
        
        return "김서방은 " + result + "에 있다";
    }
}