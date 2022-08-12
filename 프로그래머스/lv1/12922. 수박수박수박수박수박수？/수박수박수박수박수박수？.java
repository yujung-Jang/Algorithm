class Solution {
    public String solution(int n) {
        
        StringBuilder sb = new StringBuilder();
        
        //"수박"을 한 묶음으로 생각한다
        String s = "수박";
        
        for (int i = 0; i < n / 2; i++) sb.append(s);
        
        //n이 짝수라면 n / 2만큼 출력하고,
        //n이 홀수라면 n / 2만큼 출력 후 뒤에 "수"를 붙인다
        if (n % 2 == 0) return sb.toString();
        else {
            sb.append("수");
            return sb.toString();
        }
        
    }
}