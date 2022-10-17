class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
		int c[] = new int[a.length + b.length];
		int i=0;
		for(int n : a) c[i++] = n;
		for(int n : b) c[i++] = n;
		return c;
	}
	public static void print(int[] a) {
		String s = "";
		for(int n : a) s += (" " + n);
		System.out.println("["+s+" ]");
	}
}

public class Main {
	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}