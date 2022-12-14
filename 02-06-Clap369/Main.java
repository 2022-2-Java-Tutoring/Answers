import java.util.Scanner;

// 02-02-Operation 문제의 확장

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.print("두 자리 정수 입력 >>");
			num = sc.nextInt();
		} while(num<10 || 99<num); // 두 자리 정수 입력 보장
		
		int d[] = new int[2];
		d[0] = num % 10; // 일의 자리
		d[1] = (num % 100) / 10; // 십의 자리; 두 자리 정수 입력이 보장되지 않는 경우 고려

		System.out.print("박수");
		for(int i=0; i<d.length; i++)
			switch (d[i]) { case 3: case 6: case 9: System.out.print("짝"); }

		sc.close();
	}
}