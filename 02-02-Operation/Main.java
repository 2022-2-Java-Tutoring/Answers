import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, d10, d1;
		do{
			System.out.print("두 자리 정수 입력 >>");
			num = sc.nextInt();
		} while(num<10 || 99<num); // 두 자리 정수 입력 보장
		
		d10 = (num % 100) / 10; // 두 자리 정수 입력이 보장되지 않은 경우
		d1 = num % 10;
		
		System.out.printf(
				"%s 10의 자리와 1의 자리가 %s.\n",
				(d10 == d1) ? "Yes!": "No!",
				(d10 == d1) ? "같습니다": "다릅니다");
		
		sc.close();
	}
}