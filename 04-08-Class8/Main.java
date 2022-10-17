import java.util.ArrayList;
import java.util.Scanner;

class Phone {
	private String name, tel;
	
	public Phone(String name, String tel) {
		this.name= name;
		this.tel=tel;
	}
	public String getName() { return name; }
	public String getTel() { return tel; }
}

class PhoneBook {
	private ArrayList<Phone> phone;
	
	PhoneBook(int size){
		phone = new ArrayList<Phone>(size);
	}
	
	public void save(String name, String tel) {
		phone.add(new Phone(name, tel));
	}
	public String search(String name) {
		for(Phone p : phone) {
			if (p.getName().equals(name)) return p.getTel();
		} return null;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int num = sc.nextInt(); 
		PhoneBook pb = new PhoneBook(num);
		
		String name, tel, res;
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호 (빈 칸없이 입력) ");
			name= sc.next(); tel= sc.next();
			pb.save(name, tel);
		} System.out.println("저장되었습니다...");
		while (true) {
			System.out.print("검색할 이름>>");
			name = sc.next();
			if(name.equals("그만")) break;
			
			res = pb.search(name);
			if (res != null) System.out.println(pb.search(name));
			else System.out.println(name+"이 없습니다");
		}
		sc.close();
	}
}