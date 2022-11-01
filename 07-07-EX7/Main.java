// 7-7

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class StudentScore {
	private String name;
	private double score;
	public String getName() {return name;}
	public double getScore() {return score;}
	
	// 객체 초기화는 두 가지 방식이 있다
	// 1.eager 2:lazy
	Scanner sc;
	HashMap<String, Double> map;
	
	// 만약 이름과 학점 정보를 7개 입력받아야 하는 상황이라면?
	// 초기화와 같이 분명하게 정해진 방식으로 동작하는 것이 아니라면 파라미터를 적극 활용하자
	public void inputInfo(int iter) {
		
		// lazy initialization
		sc  = new Scanner(System.in); 
		map = new HashMap<String, Double>();
		
		System.out.println("미래장학금 관리시스템입니다");
		for(int i=0;i<iter;i++) {
			System.out.print("이름과 학점>> ");
			name=sc.next();
			score =sc.nextDouble();
			map.put(name, score);
		}
		sc.close(); // 스캐너 사용 후 close() 하기
	}
	
	
	public void choose() {
		
		// initialization 방식 변경에 따른 예외 처리
		if (map == null) return;
		// 또는 throw new NullPointerException()
		
		System.out.print("장학생 선발 학점 기준 입력>>");
		double standard = sc.nextDouble();
		
		// 출력
		// 7-8에서 사용한 HashMap 출력 방식 참고
		System.out.println("장학생 명단 ");
		Set<String> nameSet = map.keySet(); 
		Iterator<String> it= nameSet.iterator();
		while(it.hasNext()) {
			name= it.next();
			score = map.get(name);
			if(score >= standard) { // 문제 정의 미준수: 기준 이상이면 등호 포함
				System.out.print(name + " "); // 문제 정의 미준수: 한 줄에 출력
			}
		}
		System.out.println();
	}
}

public class Main {
	public static void main(String[] args) {
		StudentScore ss = new StudentScore();
		ss.inputInfo(5); // 메소드 변경에 따른 argument(인자) 전달
		ss.choose();
	}

}