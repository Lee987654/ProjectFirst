package AddressBook;

public class  UniversityFriend extends Friend {
String major;
	
	public UniversityFriend(String name, String phnum, String major) {
		super(name, phnum);
		this.major = major;
	}

	@Override
	void showInfo() {
		super.showInfo();
		System.out.println("���� : " + this.major);
	}

	
}
