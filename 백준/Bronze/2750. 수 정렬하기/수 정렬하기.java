import java.util.*;

public class Main {
    public static void main(String[] args) {
        int min;
        int index = 0;
        int temp = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            min = 9999; //아래 반복마다 min 초기화 필요
            //작은 값을 min에 넣고, 전체 데이터와 비교하여 검사한다
            for(int j=i; j<n; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    index = j; //원래 데이터의 위치를 기억
                }
            }
            //위치를 바꾼다
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for(int i=0; i<n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}