// 3-1
public class Main {

	public static void main(String[] args) {
		// 실습문제 3-1
		// (1) 100보다 작은 짝수의 합을 출력하는 코드, 2450
		// (2)
		System.out.println( sumEvenWhile(100)	 );
		System.out.println( sumEvenFor(100)	 	 );
		System.out.println( sumEvenDoWhile(100)	 );
	}

	static private int sumEvenWhile(int to)
	{
		int sum=0, i=0;
		while((i+=2) < to) sum += i;
		return sum;
	}

	static private int sumEvenFor(int to)
	{
		int sum=0;
		for(int i=0; i<to; i+=2) sum += i;
		return sum;
	}

	static private int sumEvenDoWhile(int to)
	{
		int sum=0, i=0;
		do { sum += i; } while ((i+=2) < to);
		return sum;
	}

}