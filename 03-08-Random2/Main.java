import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 중복없는 n개의 정수 배열
		int n, limit = 100;
		do{
			System.out.print("정수 몇 개?");
			n = sc.nextInt();
		} while(n<1 || limit<n); // [1, limit]
		
		int arr[] = new int[n];
		boolean[] isAssigned = new boolean[limit+1]; // false로 초기화된 상태; 할당 여부 기록
		
		int i=0;
		do {
			arr[i] = (int)(Math.random() * limit + 1); // [1, limit]
			if (isAssigned[arr[i]] == true) continue;
			else isAssigned[arr[i++]] = true;
		} while( i<arr.length );

		
		// 10번의 출력마다 줄바꿈
		for(i=1; i<=arr.length; i++) {
			System.out.print(arr[i-1] + "\t");
			if(i%10 == 0) System.out.println();
		}
		
		sc.close();
	}
}