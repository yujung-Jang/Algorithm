import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        // 번호를 담는 Map을 생성한다
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], i);


        for (int i = 0; i < phone_book.length; i++) {
            // 각 번호의 여러 일부에 해당하는 key가 있는지 찾는다
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }
        }

        return true;
    }
}