import java.util.Scanner;

// Q2-3과 유사

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int m=0;
		
		System.out.print("금액을 입력하시오>>");
		int money = scanner.nextInt();
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i=0; i<unit.length; i++) {
			m=(int)money/unit[i];
			money%=unit[i];
			System.out.println(unit[i] + "원 짜리 : " + m + "개");
		}
		scanner.close();
	}
}