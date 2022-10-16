import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char c;
		do{
			System.out.print("소문자 알파벳 하나를 입력하시오>>");
			c = sc.next().charAt(0);
		} while(c<'a' || 'z'<c); // 소문자 알파벳 입력 보장
		
		for(char row = 0; row <= c-'a'; row++) {
			for(char col = 'a'; col <= c - row; col++)
				System.out.print(col);
			System.out.println();
		}
		sc.close();
	}
}