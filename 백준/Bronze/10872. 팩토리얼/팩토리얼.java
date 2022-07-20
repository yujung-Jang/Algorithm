import java.util.*;

public class Main {
	public static void main(String args[]) {
	 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(factorial(n));
	}
	
	//n과 n-1, n-2, ...를 곱하는 메소드 작성
	public static int factorial(int i) {
		if(i == 0 || i == 1)
			return 1;
		else
			return i * factorial(i - 1);
	}
}