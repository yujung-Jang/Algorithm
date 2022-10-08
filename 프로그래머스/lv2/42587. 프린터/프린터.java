import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        // Queue: 프린트 대기열
        // Queue에 배열의 요소들을 인덱스와 함께 담는다
        Queue<Integer[]> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++)
            q.add(new Integer[]{i, priorities[i]});

        int count = 0; // 몇 번째에 출력되는지 카운트
        while (true) {

            Integer[] now = q.poll(); // 문서 하나를 꺼낸다
            boolean max = true; // 문서들 중 가장 큰 중요도를 가졌는지 체크

            for (Integer[] documentLevel : q) {
                if (now[1] < documentLevel[1]) {
                    max = false; // 만약 현재 문서보다 더 큰 중요도를 가진 문서가 있다면 false
                    break;
                }
            }

            if (max) {
                count++; // 가장 큰 중요도를 가진 문서라면 출력 순서가 밀리므로 count 증가
                if (location == now[0]) break; // 궁금한 문서였다면 반복문을 빠져나가서 count 리턴
            } else {
                q.add(now); // 가장 큰 중요도를 가진 문서가 아니라면 다시 Queue에 넣는다
            }
        }

        return count;
    }
}