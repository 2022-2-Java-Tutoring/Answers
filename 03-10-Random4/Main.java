public class Main {
	public static void main(String[] args) {
		int array[][] = new int[4][4];
		int cnt = 0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = 0;
			}
		}
		while(cnt < 10) {
			int row = (int)(Math.random()*4); // [0, 4) == [0, 3]
			int col = (int)(Math.random()*4); // [0, 4) == [0, 3]
			
			if(array[row][col] != 0)
				continue;
			else {
				array[row][col] = (int)(Math.random()*9+1); // [1, 9]
				cnt++;
			}
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}	
	}
}