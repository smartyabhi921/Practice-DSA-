import java.util.*;

public class Fun3 {

	public static int SumTwo(int a, int b) {

		return a * b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(SumTwo(a, b));
		sc.close();

	}

}
