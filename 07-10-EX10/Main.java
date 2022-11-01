// 7-10
// 본문 5.6절, 5.7절, 6장 실습문제 6번 참고

import java.util.Scanner;
import java.util.Vector;

// 외부에서 import한다는 전제
abstract class Shape {
	private Shape next;
	public Shape() { next = null; }
	public void setNext(Shape obj) { next = obj; }//링크 연결
	public Shape getNext() { return next; }
	public abstract void draw();//추상 메소드
}
class Line extends Shape{
	public void draw() { System.out.println(getClass().getName()); }
}
class Rect extends Shape{
   public void draw() { System.out.println(getClass().getName()); }
}
class Circle extends Shape{
   public void draw() { System.out.println(getClass().getName()); }
}

class ShapeManager // 기능을 별도의 클래스로 작성
{
	private Vector<Shape> next;
	public ShapeManager() { next = new Vector<Shape>(); }
	public void add(Shape s) { next.add(s); }
	public void delete(int i) {
		if (next.size() <= i) // 조건 간소화
			System.out.println("삭제할 수 없습니다.");
		else next.remove(i);
	}
	public void showAll() { for(Shape s : next) s.draw(); }
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShapeManager sm = new ShapeManager();
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		
		while(true)
		{
			System.out.println("삽입(1),삭제(2),모두보기(3),종료(4)>>");
			switch(sc.nextInt())
			{
			case 1:
	            System.out.print("Line(1), Rect(2), Circle(3)>>");
	            Shape shape = null;
	            switch(sc.nextInt()) {
		            case 1: shape = new Line(); break;
		            case 2: shape = new Rect(); break;
		            case 3: shape = new Circle(); break;
	            } sm.add(shape);
	            break;
	            
            case 2:
	            System.out.print("삭제할 도형의 위치>>");
	            sm.delete(sc.nextInt());
	            break;
	            
            case 3:
            	sm.showAll(); break;
            	
            case 4:
            	System.out.println("beauty을 종료합니다.");
            	sc.close(); return;
			}
		}
	}
}