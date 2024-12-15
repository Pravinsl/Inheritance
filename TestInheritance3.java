package com.Inheritace_programs;

class Animal3 {
	 void eat () {
		 System.out.println("Eating..");
	 }
	}
	class Dog2 extends Animal3 {
		void bark () {
			System.out.println("Barking..");
		}
	}
	class Cat extends Animal3{
		void meow() {
			System.out.println("Meow..");
		}
	}
public class TestInheritance3 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.meow();
	//	c.bark(); compiler time error will be occurred
	}
}
