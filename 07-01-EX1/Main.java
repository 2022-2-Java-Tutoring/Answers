// 7-1
// 접근 지정자 사용 의도를 잘 모르겠음
// 별도의 클래스로 분리한 이유도 잘 모르겠음

import java.util.Scanner;
import java.util.Vector;

public class Main {
   public static void main(String[] args) {
	   Vector<Integer> v = new Vector<Integer>();

	   // INPUT
	   Scanner sc = new Scanner(System.in);
	   System.out.print("정수(-1이 입력될 때까지)>> ");
	   int input;
	   while (true) {
		   input = sc.nextInt();
		   if (input == -1) break;
		   else v.add(input);
	   }
	   sc.close();
	   
	   // OUTPUT
	   int max = v.get(0);
	   for (int num : v) if (max < num) max = num;
	   System.out.println("가장 큰 수는 " + max);
   }
}