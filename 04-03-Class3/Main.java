class Song
{
	private String title, singer, country;
	private int year;
	
	public Song() {}
	public Song(String title, String singer, int year, String country) {
		this.title = title;
		this.singer = singer;
		this.year=year;
		this.country=country;
	}
	public void show() {
		System.out.printf(
				"%d년 %s국적의 %s가 부른 %s\n",
				year, country, singer, title);
	}
}
public class Main {
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
	}
}