import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //1부터 n까지의 수를 Queue에 담는다
        Queue<Integer> cards = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            cards.add(i);

        //Queue의 크기가 1이 될 때까지 반복한다
        while (cards.size() != 1) {

            //제일 위에 있는 카드를 한 장 꺼낸다
            cards.poll();

            //그 다음에 있는 카드를 꺼내서 제일 아래에 있는 카드 밑으로 옮긴다
            Integer top = cards.poll();
            cards.add(top);
        }

        //제일 마지막에 남게 되는 카드를 출력한다
        System.out.println(cards.poll());
    }
}
