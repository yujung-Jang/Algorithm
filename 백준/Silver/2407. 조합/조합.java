import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        //nCr = n! / (n-r)! * r!

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int r = Integer.parseInt(s[1]);

        BigInteger n1 = BigInteger.ONE; //1
        BigInteger r1 = BigInteger.ONE;

        for (int i = 0; i < r; i++) {

            n1 = n1.multiply(new BigInteger(String.valueOf(n - i))); //n! / r!
            r1 = r1.multiply(new BigInteger(String.valueOf(i + 1))); //(n-r)!
        }

        BigInteger answer = n1.divide(r1); //(n! / r!) / (n-r)!

        System.out.println(answer);
    }
}