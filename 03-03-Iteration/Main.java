import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n = scanner.nextInt();
		
		for(int row = 0; row < n; row++) {
			for(int col = n - row ; col > 0; col--) System.out.print("*");
			System.out.println();
		}
		scanner.close();
	}
}