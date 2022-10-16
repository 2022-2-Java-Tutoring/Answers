import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	// Q15 문제 확인 후 업데이트
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x,y;
		
		while(true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				x = scanner.nextInt();
				y = scanner.nextInt();
				
				System.out.println(x + " x " + y + " = " + x*y);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.nextLine();
			}
		}
		scanner.close();
	}
}