class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length <= 1) {
            return new int[]{-1};
        }

        int[] result = new int[arr.length - 1];

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == min)) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}