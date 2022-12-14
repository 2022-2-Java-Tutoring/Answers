import java.util.Scanner;

public class Main {
	
	static double euclideanDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) );
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 원의 중심과 반지름 입력>> ");
		double p1X, p1Y, p1R;
		p1X = sc.nextDouble();
		p1Y = sc.nextDouble();
		p1R = sc.nextDouble();
		
		System.out.print("두번쨰 원의 중심과 반지름 입력>> ");
		double p2X, p2Y, p2R;
		p2X = sc.nextDouble();
		p2Y = sc.nextDouble();
		p2R = sc.nextDouble();
		
		System.out.printf( 
				"두 원은 서로 %s겹친다", // 두 원이 서로 접하는 것 또한 겹치는 것으로 간주한다.
				euclideanDistance(p1X, p1Y, p2X, p2Y) > p1R + p2R ? "안 " : "");
		sc.close();
	}
	
}