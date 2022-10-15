import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        // 반환할 문자열 변수를 정의한다
        String result = "";

        // String 배열에 담는다
        String[] arr = new String[numbers.length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = String.valueOf(numbers[i]);

        // 정렬 조건을 정의하여 정의한다
        // 두 수(문자열)를 이어붙이는 순서에 따른 결과를 비교한다
        Arrays.sort(arr, (a, b) -> {
            return (a + b).compareTo(b + a);
        });

        // 수를 이어붙인다
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i];
        }
        
        // 모두 0일 경우 0을 반환한다 (첫 자리만 비교해도 된다)
        if (result.charAt(0) == '0')
            return "0";

        return result;
    }
}