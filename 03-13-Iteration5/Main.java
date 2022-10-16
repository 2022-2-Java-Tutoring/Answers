public class Main {
	public static void main(String[] args) {
		int x, y;
		
		for(int i=1; i<=99; i++) {
			x=i/10;
			y=i%10;
			
			if(x!=0 && x%3==0) {
				if(y!=0 && y%3==0)
					System.out.println(i + " 박수 짝짝");
				else if(y==0)
					System.out.println(i + " 박수 짝");
			}
			else {
				if(y!=0 && y%3==0)
					System.out.println(i + " 박수 짝");
			}
		}
	}
}