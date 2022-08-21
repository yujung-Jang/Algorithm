class Solution {
    public String solution(String phone_number) {
        
        int length = phone_number.length();
        String result = "";
        
        for (int i = 0; i < length - 4; i++)
            result += "*";
        
        for (int i = length - 4; i < length; i++) {
            result += String.valueOf(phone_number.charAt(i));
        }
        
        return result;
    }
}