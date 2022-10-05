import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        //key에는 참가 선수 이름, value에는 해당 이름의 참가자 수를 담는다 (동명이인)
        Map<String, Integer> map = new HashMap<>();
        
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        
        //완주하지 못한 선수를 판별하는 반복문
        for (String player : completion)
            map.put(player, map.get(player) - 1);
        
        for (String key : map.keySet()) {
            
            if (map.get(key) != 0)
                return key;
        }

        return "";
    }
}