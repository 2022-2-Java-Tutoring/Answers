import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.print("달을 입력하세요(1~12) >>");
			num = sc.nextInt();
		} while(num<1 || 12<num); // 닫힌 구간 [1, 12] 내 정수 입력 보장
				
		// switch 나 if-else로도 해결 가능
		String[] season = {"잘못 입력하였습니다.", "겨울", "겨울", "봄", "봄", "봄", "여름", "여름", "여름", "가을", "가을", "가을", "겨울"};
		if (num<1 || 12<num) num = 0; // 입력에 제한을 두지 않은 경우
		System.out.println(season[num]);
		sc.close();
	}
}