class Solution {
    public long solution(int a, int b) {
        
        long sum = 0;
        
        if (a == b) return a;
        if (a > b) {
            long temp = a;
            a = b;
            b = (int)temp;
        }
        
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        
        return sum;
    }
}