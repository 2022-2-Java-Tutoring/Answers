import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위:원)>> ");
		
		int won = sc.nextInt();
		double rate = 1100;
		double dollar = (double)won / rate;
		
		System.out.println(won + "원은 $" + dollar + "입니다.");
		sc.close();
	}
}
