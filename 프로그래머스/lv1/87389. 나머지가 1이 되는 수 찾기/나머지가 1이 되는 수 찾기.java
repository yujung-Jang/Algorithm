class Solution {
    public int solution(int n) {
        
        //나누는 수는 2 이상의 홀수이므로 2를 넣어서 판별한 후
        //n을 3 이상인 홀수로 나눠서 나머지가 1이 되는지 판별한다
        if (n % 2 == 1) return 2;
        
        int m = 3;
        
        do {
            if (n % m == 1) return m;
            m += 2;
        } while (n % m != 1);
        
        return m;
    }
}