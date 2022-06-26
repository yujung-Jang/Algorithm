import java.util.*;

public class Main {

    public static void quickSort(int[] data, int start, int end) {
        if (start >= end) { //원소가 1개일 때
            return;
        }

        int pivot = start; //pivot은 첫 번째 원소
        int i = start + 1;
        int j = end;
        int temp;

        while (i <= j) { //엇갈릴 때까지 반복
            while (i <= end && data[i] < data[pivot]) { //pivot 값보다 큰 값을 만날 때까지
                i++;
            }
            while (j > start && data[j] >= data[pivot]) { //pivot 값보다 작은 값을 만날 때까지
                j--;
            }
            if (i > j) { //현재 엇갈린 상태면 pivot 값과 교체
                temp = data[j];
                data[j] = data[pivot];
                data[pivot] = temp;
            } else { //pivot 값보다 큰 값과 작은 값을 찾았고, 엇갈리지 않았다면 서로 교체
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        //재귀 함수
        quickSort(data, start, j - 1); //pivot 값과 j 위치의 값을 서로 바꿨으므로
        quickSort(data, j + 1, end);
    }

    public static void main(String[] args) {

        int[] data = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            data[i] = sc.nextInt();
        }

        quickSort(data, 0, 2);

        for(int i = 0; i < 3; i++) {
            System.out.print(data[i] + " ");
        }
    }
}