// 7-9

import java.util.ArrayList;

// 자료구조에 대한 추상 자료형 정의 (Abstract Data Type, ADT)
// 제네릭 템플릿으로 일반화시켜 재사용성 증대
interface IStack<T>{
   public T pop();
   public boolean push(T ob); 
}

class MyStack<T> implements IStack<T> {
   ArrayList<T> list = null;
   
   // lazy initialization
   public MyStack() {
      list = new ArrayList<T>();
   }
   
   // empty 메소드를 별도로 만들어도 괜찮을 것 같아!
   // 비었을 때 return null을 한다면 
   // 템플릿 T 타입은 이후 nullable 변수로 취급하고 사용해야 해
   @Override
   public T pop() {
      if(list.size() == 0) return null;
      else return list.remove(0);
   }
   
   // 함수의 수행결과를 파악하기 위해 boolean형으로 선언한 의도는 알겠어
   // 하지만 그건 C style 코딩이고, return false를 넣어주기엔 add 메소드의 return값
   // add 메소드에 try-catch를 걸어서 예외 처리의 방식으로 진행하는게 나아
   @Override
   public boolean push(T ob) {
	      try {
	          list.add(0,ob);
	          return true;
	    } catch (Exception e) {
	    	
// add 메소드에 대한 document를 보면 정의된 예외들에 대한 내용이 나와
/*
 * Throws:
 * UnsupportedOperationException - if the add operationis not supported by this list
 * ClassCastException - if the class of the specified elementprevents it from being added to this list
 * NullPointerException - if the specified element is null andthis list does not permit null elements
 * IllegalArgumentException - if some property of the specifiedelement prevents it from being added to this list
 * IndexOutOfBoundsException - if the index is out of range(index < 0 || index > size())
 * */
	    	if (e instanceof IndexOutOfBoundsException) {
	    		// TODO 예외 처리
	    	}
	    	else System.err.println(e);
	    	return false;
	    }
   }
}
public class Main {
   public static void main(String[] args) {
      IStack<Integer> stack = new MyStack<Integer>();
      for(int i=0; i<10; i++) stack.push(i);
      while(true) {
         Integer n = stack.pop();
         if(n == null) break;
         System.out.print(n + " ");
      }
   }
}