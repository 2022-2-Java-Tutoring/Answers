import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		
		String[] unitName = { "오만원권", "만원권", "천원권", "백원", "오십원", "십원", "일원" };
		int[] unit = { 50000, 10000, 1000, 100, 50, 10, 1 };
		int[] quantity = new int[unit.length];
		
		for(int i=0; i<unit.length; i++) {
			quantity[i] = money / unit[i];
			money %= unit[i];
		}
		
		for(int i=0; i<unit.length; i++) {
			String lastChar = unitName[i].substring( unitName[i].length() - 1 );
			System.out.printf("%s %d%s\n", unitName[i], quantity[i], lastChar.equals("권")?"매":"개");
		}
			
		sc.close();
	}
}