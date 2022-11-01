// 7-8

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

   public static void main(String[] args) {
	  // 초기화
      HashMap<String, Integer> dic = new HashMap<String, Integer>();
      Set<String> keys = dic.keySet();
      
      Scanner sc = new Scanner(System.in);
      System.out.println("** 포인트 관리 프로그램입니다.");
      
      while(true)
      {
    	 // 입력
         System.out.print("이름과 포인트 입력>> ");
         String name= sc.next();
         if(name.equals("그만")) break;
         int point = sc.nextInt();
         
         // 저장
         if(dic.get(name) == null) { dic.put(name, point); }
         else { dic.put(name, dic.get(name) + point); } // 문제 정의 미준수: 포인트는 덧셈 연산

         // 출력: HashMap 출력 방법 세 가지
         // 1: dic.keySet() : 출력 전용
         for( String key : dic.keySet() )
        	 System.out.println( String.format("(%s,%d)", key, dic.get(key)) );
         
         // 2: dic.keySet() : iterator()
         Iterator<String> it = keys.iterator();
         while( it.hasNext() )
        	 System.out.println( String.format("(%s,%d)", it.next(), dic.get(it.next())) );
         
         // 3: dic.entrySet() : Map.Entry<T,T>
         for( Map.Entry<String, Integer> elem : dic.entrySet() )
        	 System.out.println( String.format("(%s,%d)", elem.getKey(), elem.getValue()) );
         
      }
      System.out.println("프로그램을 종료합니다.");
      sc.close(); // Scanner 사용 후 close() 해주기
   }
}