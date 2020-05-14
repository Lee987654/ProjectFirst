package AddressBook;

public class Friend {
	String name;
	String phnum;
	
	public Friend(String name, String phnum){
		this.name = name;
		this.phnum = phnum;
	}
	void showInfo() {
		System.out.println("이름 : "+ this.name + "전화번호 : " + this.phnum);
	}
}


