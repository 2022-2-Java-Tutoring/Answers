// 7-5 (1)

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Student {
	private String name;
	private String part;
	private String number;
	private double grade;
	public Student(String name, String part, String number, double grade) {
		this.name = name;
		this.part = part;
		this.number = number;
		this.grade = grade;
	}
	public String getName() { return name; }
	public String getPart() { return part; }
	public String getNumber() { return number; }
	public double getGrade() { return grade; }
}

public class Main {
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
      // Student[] student = new Student[4];
      // 별도의 배열에 저장해두지 않더라도 바로 생성한 Student 인스턴스를 ArrayList에 추가할 수 있다.
      ArrayList<Student> check = new ArrayList<Student>();
      
      System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
      for (int i = 0; i < 4; i++)
      {
         System.out.print(">>"); String text = sc.nextLine();
         
         // nextToken()을 수행하는 순서를 신경써야 올바른 출력이 나온다.
         StringTokenizer st = new StringTokenizer(text,",");
         String name = st.nextToken().trim();
         String department = st.nextToken().trim();
         String id = st.nextToken().trim();
         // trim() 메소드는 공백을 하나의 데이터로 인식하는 String에서만 유의미
         double gpa = Double.parseDouble(st.nextToken());
         
         check.add( new Student(name, department, id, gpa) );
      }
      for(int i = 0; i < check.size(); i++)
      {
         System.out.println("------------------------------------");
         Student st = check.get(i);
         // java Style의 getter naming convention 참고
         // 동사(verb) + 명사(noun) 그리고 띄어쓰기 대신 대문자로 구분
         // 기존에 쓴 언더바(_) 활용은 out-dated C Style이다.
         System.out.println("이름: " + st.getName());
         System.out.println("학과: " + st.getPart());
         System.out.println("학번: " + st.getNumber());
         System.out.println("학점평균: " + st.getGrade());
      }
      sc.close();
   }
}