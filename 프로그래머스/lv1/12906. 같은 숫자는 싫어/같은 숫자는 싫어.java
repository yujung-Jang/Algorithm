import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Queue<Integer> q = new LinkedList<>();

        //배열의 요소들을 이전 요소와 비교해서 같지 않다면 Queue에 넣는다
        int pre = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != pre) {
                q.add(arr[i]);
                pre = arr[i];
            }
        }

        //중복이 제거된 Queue의 크기와 같은 배열을 생성한다
        int[] result = new int[q.size()];

        //생성한 배열에 Queue의 요소를 꺼내서 넣는다
        for (int i = 0; i < result.length; i++) {
            result[i] = q.poll();
        }

        return result;
    }
}