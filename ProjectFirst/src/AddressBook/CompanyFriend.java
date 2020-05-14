package AddressBook;

public class CompanyFriend extends Friend{
	String depart;

	public CompanyFriend(String name, String phnum, String depart) {
		super(name, phnum);
		this.depart = depart;
		
	}

	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("ºÎ¼­ : "+ this.depart);
}
}


