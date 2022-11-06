import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Queue<Integer> q = new LinkedList<>();
          int sum = 0;
          int sec = 0;

          for (int truck : truck_weights) {

               while (true) {
                    if (q.isEmpty()) { // q가 비어 있을 때
                         q.add(truck);
                         sum += truck;
                         sec++;
                         break;
                    } else if (q.size() == bridge_length) { // q.size()가 다리 길이와 같을 때
                         sum -= q.poll();
                    } else if (weight >= (sum + truck)) { // 다음 트럭 진입 가능
                         q.add(truck);
                         sum += truck;
                         sec++;
                         break;
                    } else { // 다음 트럭 진입 불가능
                         q.add(0);
                         sec++;
                    }
               }
          }

          return sec + bridge_length;
    }
}