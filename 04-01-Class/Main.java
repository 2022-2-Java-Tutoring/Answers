class TV {
	private String company; 
	private int year; 
	private int size; 
	
	public TV(String company, int year, int size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}
	
	public void show(){
		System.out.printf(
				"%s에서 만든 %d년형 %d인치 %s\n",
				company,year,size,getClass().getName());
	}
}

public class Main {
	public static void main(String args[]) {		
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년형 32인치 TV
		myTV.show();
	}
}