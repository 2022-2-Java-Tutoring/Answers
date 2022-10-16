public class Main {

	public static void main(String[] args) {
		// 실습문제 3-1
		// (1) 100보다 작은 짝수의 합을 출력하는 코드, 2450
		// (2)
		System.out.println( WhileTest()	 );
		System.out.println( ForTest()	 );
		System.out.println( DoWhileTest());
	}

	// 이하 3종의 함수 작성자: 남윤호
	static private int WhileTest()
	{
		int sum=0, i=0;
		while(i<100) {
			sum+=i;
			i+=2;
		} return sum;
	}

	static private int ForTest()
	{
		int sum=0;
		for(int i=0; i<100; i+=2) {
			sum=sum+i;
		} return sum;
	}

	static private int DoWhileTest()
	{
		int sum=0, i=0;
		do {
			sum+=i;
			i+=2;
		} while(i<100);
		return sum;
	}

}