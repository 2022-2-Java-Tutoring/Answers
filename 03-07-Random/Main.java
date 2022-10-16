import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int n[] = new int[10];
		int sum=0;
		
		for(int i=0; i<n.length; i++) {
			n[i]=(int)(Math.random()*10+1); // 닫힌 구간 [1, 10] 사이 정수
			sum+=n[i];
		}
		System.out.print("랜덤한 정수들 : ");
		// for(int i=0; i<n.length; i++) System.out.print(n[i] + " "); System.out.println();
		System.out.println(Arrays.toString(n));
		System.out.println("평균은 " + (double)sum/n.length);
	}
}