import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] bookInfo = br.readLine().split(" ");

        int dummy = Integer.parseInt(bookInfo[1]);

        //dummy 값만큼 반복
        for (int i = 0; i < dummy; i++) {
            int bookCount = Integer.parseInt(br.readLine());
            String[] bookArr = br.readLine().split(" ");

            //한 더미의 책 수만큼 반복
            for (int j = 1; j < bookCount; j++) {
                //책이 아래 → 위 내림차순이어야 한다
                //아래의 책 번호보다 위의 책 번호가 크다면 No
                if (Integer.parseInt(bookArr[j]) > Integer.parseInt(bookArr[j - 1])) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}
