import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        //옷의 종류를 Key로 하고, 해당하는 옷의 개수를 Value로 하는 Map을 생성한다
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            if (!map.containsKey(clothes[i][1]))
                map.put(clothes[i][1], 1);
            else
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        }

        // Map의 Value에 접근하여 모든 개수를 곱한다
        // 한 종류의 옷을 입는 경우의 수는 (옷의 개수 + 하나도 안 입는 경우)이다
        int multiplication = 1;
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            multiplication *= map.get(key) + 1;
        }

        // 아무것도 입지 않는 경우는 없으므로 결과에서 1을 뺀다
        return multiplication - 1;
    }
}