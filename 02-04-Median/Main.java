import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		
		int[] n = new int[3];
		n[0] = sc.nextInt();
		for(int i=1; i<n.length; i++) {
			n[i] = sc.nextInt();
			if (n[i] < n[i-1]) // SWAP(n[i], n[i-1])해서 배열 정렬
				{ int temp = n[i]; n[i] = n[i-1]; n[i-1] = temp; }
		}
		
		System.out.println("중간 값은 " + n[n.length / 2]);
		
		sc.close();
	}
}