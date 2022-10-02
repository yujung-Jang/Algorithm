import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        //각 작업이 종료되는 날짜를 Queue에 순서대로 넣는다
        Queue<Integer> days = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++)
            days.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));

        //각 배포마다 함께 배포되는 기능의 수를 넣는다
        List<Integer> list = new ArrayList<>();

        //Queue가 비어 있지 않다면 반복한다
        while (!days.isEmpty()) {

            //Queue에서 작업 날짜 하나를 꺼낸 후 count를 1로 초기화한다
            int release = days.poll();
            int count = 1;

            /* Queue의 요소가 남아 있고, peek을 했을 때 release보다 적거나 같다면 이미 작업이 완료된 것이다
            count를 증가시키고 확인한(peek) 요소를 poll 한다
            release보다 큰 수가 나올 때까지 반복한다 */
            while (!days.isEmpty() && days.peek() <= release) {
                count++;
                days.poll();
            }

            list.add(count);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}