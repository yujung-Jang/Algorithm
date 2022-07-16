import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<>();

        int pre = 10;
        for (int i : arr) {
            if (i != pre) {
                list.add(i);
            }
            pre = i;
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}