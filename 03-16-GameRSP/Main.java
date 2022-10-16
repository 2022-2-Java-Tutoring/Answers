import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] str = {"가위", "바위", "보"};
		String user;
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			int iC=(int)(Math.random() * 3);
			System.out.print("가위 바위 보!>>");
			user=scanner.next();
			if(user.equals("그만")) break;
			
			// get str_index of user
			int iU = 0; // default: "가위"; 잘못 입력하면 나오는 값
			for(int i=0; i<str.length; i++) {
				if(str[i].equals(user)) {iU = i; break;}
			} 
			
			System.out.print("사용자= " + str[iU] + ", 컴퓨터= " + str[iC] + ", ");
			
			if (iU == iC) System.out.println("비겼습니다.");
			else if (iU == (iC+1)%3) System.out.println("사용자가 이겼습니다.");
			else System.out.println("컴퓨터가 이겼습니다.");
			
		}
		System.out.println("게임을 종료합니다...");
		scanner.close();
	}
}