package com.Inheritace_programs;

public class Employee {
   float salary = 4000;
}
class Programmer extends Employee{
	int bonous=10000;
	public static void main(String[] args) {
		Programmer p = new Programmer ();
		System.out.println("Programmer salary is :"+p.salary);
		System.out.println("Programmer Bonas is :"+p.bonous);
	}
}
// In the above example , Programmer object an access the field of own class as well as of Employee class that mean her to show the code reusability her 