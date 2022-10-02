import java. util.*;

class Solution {
    public int solution(int[] nums) {
        
        //key는 폰켓몬의 종류, value는 key에 해당하는 폰켓몬 수를 담는 Map 생성
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //nums에 접근해서 이미 map에 담은 폰켓몬 종류라면 값을 얻은 후 값에 1 증가시킨다
            if (map.containsKey(nums[i])) {
                Integer current = map.get(nums[i]);
                map.put(nums[i], current++);
            } else { //map에 담은 종류가 아니라면 해당 종류의 key를 생성해서 1을 담는다
                map.put(nums[i], 1);
            }
        }

        int choice = nums.length / 2; //고를 수 있는 폰켓몬 수
        int size = map.size(); //종류의 수

        //만약 고를 수 있는 폰켓몬 수가 종류보다 적다면 고를 수 있는 최대 폰켓몬 수를 반환
        //그렇지 않다면 모든 종류의 수를 반환
        if (choice < size) return choice;
        else return size;
    }
}