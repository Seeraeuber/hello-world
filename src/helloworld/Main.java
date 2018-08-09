package helloworld;

import java.time.LocalDate;

public class Main {
/*
	public main() {
		// TODO Auto-generated constructor stub
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person test = new Person("Andreas", "Haamann", LocalDate.of(1988, 03, 29), Gender.MALE);
		
		
		System.out.println("Hello, my name is " + test.first_name + " " + test.last_name + ", and I am " + test.getAge() + " years old.");
	}

}
