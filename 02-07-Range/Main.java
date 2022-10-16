8import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오>> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// range 설정할 때, 자신만의 기준을 정해두면 좋음
		// 어떤 수 x, y가 [100, 200] 사이의 값인지 확인할 때, 개인적으로 다음과 같은 형식을 선호함 
		if( (100<=x && x<=200) && (100<=y && y<=200) ) {
			System.out.println("(" + x + "," + y + ")은 사각형 안에 있습니다.");
		}
		else {
			System.out.println("사각형 안에 없습니다.");
		}
		sc.close();
	}
}