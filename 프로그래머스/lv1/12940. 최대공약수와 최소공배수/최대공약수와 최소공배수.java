class Solution {
    public int[] solution(int n, int m) {
        
        int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        answer[0] = gcd(max, min);
        answer[1] = max * min / answer[0];
        
        return answer;
    }
    
    static int gcd (int n, int m) {
        
        if (n % m == 0) return m;
        
        return gcd(m, n % m);
    }
}