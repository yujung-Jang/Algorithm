import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(Factorial(n));
    }
    
    static int Factorial(int n) {
        if (n > 0) return n * Factorial(n - 1);
        else return 1;
    }
    
}
