import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int stay = 0;

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for(int i = 0 ; i < n; i++) {
            sum += list.get(i);
            stay += sum;
        }

        System.out.println(stay);
    }
}