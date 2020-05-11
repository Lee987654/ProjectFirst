package com.yedam.classes;

public class PeopleExample {
		public static void main(String[] args) {
			People p1 = new People(25);
			p1.name = "sanghun";
			
			p1.height = 174;
			
			p1.study();
			p1.eat("apple");
			
			People p2 = new People();
			p2.name = "sanghun@";
			p2.age = 252;
			p2.height = 1742;
			
			People p3 = new People();
			p3.name = "sanghun#";
			p3.age = 253;
			p3.height = 1743;
					
			People[] pary = new People[3];
			pary[0] = p1;
			pary[1] = p2;
			pary[2] = p3;
			
			for (People stud : pary) {
				System.out.println(stud.height +"/" + stud.age);
			}
		}

}
