import java.util.Scanner;

class Day {
	private String work; 
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

public class Main {
	public static void main(String args[]) {
		Main april = new Main(30);
		april.run();
	}
	
	private static Scanner sc;
	private int dayNum;
	private Day day[];
	private boolean state = true;
	
	public Main(int x) {
		if (sc == null) sc = new Scanner(System.in);
		dayNum = x;
		day = new Day[dayNum];
		for(int i=0; i<day.length; i++) {
			day[i] = new Day();
		}
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(state)
		{
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int option = sc.nextInt();
			switch(option) {
			case 1: input(); break;
			case 2: view();	 break;
			case 3: finish();break;
			default: System.out.println("다시 입력해주세요!");
			} System.out.println();
		}
	}
	
	public void input() {
		System.out.print("날짜(1~30)?"); int i = sc.nextInt();
		sc.nextLine(); // System.in buffer clear
		System.out.print("할일?"); String work = sc.nextLine();
		day[i-1].set(work);
	}
	public void view() {
		System.out.print("날짜(1~30)?");
		int i = sc.nextInt();
		System.out.print(i+"일의 할 일은 ");
		day[i-1].show();
	}
	public void finish() {
		state = false; sc.close();
		System.out.println("프로그램을 종료합니다.");
	}

}