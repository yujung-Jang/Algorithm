class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, 0, target, 0);

        return answer;
    }
    
    public void dfs(int[] numbers, int depth, int target, int sum) {

        if (depth == numbers.length) { // 마지막 노드인 경우
            if (target == sum) {
                answer++;
            }
        } else { // 탐색할 노드가 남은 경우, 두 가지 경우로 깊이 우선 알고리즘 실행
            dfs(numbers, depth + 1, target, sum + numbers[depth]); // 이웃 노드 방문: +
            dfs(numbers, depth + 1, target, sum - numbers[depth]); // 이웃 노드 방문: -
        }
    }
}