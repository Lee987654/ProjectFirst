package com.yedam.nestedInterfaces;

class CallListener implements Button.OnClickListener {

	@Override
	public void onClink() {
		System.out.println("전화를 겁니다.");
	}
	
}
class MessageListener implements Button.OnClickListener {
	@Override
	public void onClink() {
		System.out.println("문자를 보냅니다.");
		
	}
	
}
public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		CallListener cListener = new CallListener();
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		MessageListener mListener = new MessageListener();
		btn.setOnClickListener(mListener);
		btn.touch();
	

	}

}

