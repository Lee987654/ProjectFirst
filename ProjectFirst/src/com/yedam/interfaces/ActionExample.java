package com.yedam.interfaces;
interface Action {
	void work();
}

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
		};
		action.work(); // ���縦 �մϴ�.

	}

}
