class Solution {
    public long[] solution(long x, int n) {
        long[] arr = new long[n];
        int count = 0;
        for (long i = x; count < n; i += x) {
            arr[count++] = i;
        }
        
        return arr;
    }
}