import java.util.Scanner;

public class Main {
	
	static double euclideanDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) );
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double circleX, circleY, radius;
		System.out.print("원의 중심과 반지름 입력>> ");
		circleX = sc.nextDouble();
		circleY = sc.nextDouble();
		radius = sc.nextDouble();
		
		double pointX, pointY;
		System.out.print("점 입력>> ");
		pointX = sc.nextDouble();
		pointY = sc.nextDouble();
		
		System.out.printf( 
				"점 %f,%f은 원 %s에 있습니다.",
				pointX, pointY, // 원 위에 있는 것은 원 밖에 있는 것으로 취급
				euclideanDistance(circleX, circleY, pointX, pointY) < radius ? "안" : "밖");

		sc.close();
	}
	
}