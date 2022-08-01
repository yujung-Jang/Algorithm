import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //최소로 만든다: 최대한 큰 수를 빼 준다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //10+20-30+40

        int sum = 0;
        String[] sub = br.readLine().split("-"); //{10+20} {30+40}

        for (int i = 0; i < sub.length; i++) { //0, 1

            int temp = 0;

            String[] add = sub[i].split("\\+"); //[10][20]

            for (int j = 0; j < add.length; j++) {
                temp += Integer.parseInt(add[j]); //30
            }

            if (i == 0) sum = temp; //첫 번째 연산이면 temp 할당 -> 30
            else sum -= temp; //그렇지 않을 경우 sum에서 temp 빼기 -> 30 - 70
        }

        System.out.println(sum); // -40
    }
}