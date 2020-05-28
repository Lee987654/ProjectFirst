package collection.list;

import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		long startTime, endTime;
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList: �ɸ��ð�" + (endTime - startTime));
		
		
		List<String> list2 = new LinkedList<>();
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0, String.valueOf(i));
}
		endTime = System.nanoTime();
		System.out.println("LinkedList: �ɸ��ð�" + (endTime - startTime)