package helloworld;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	protected String first_name;
	protected String last_name;
	protected LocalDate date_of_birth;
	protected int age;
	protected Gender gender;
	
	
	public Person(String first_name, String last_name, LocalDate date_of_birth, Gender gender) {
		
		if (first_name != null) {
		this.first_name = first_name;
		}
		
		if (last_name != null) {
		this.last_name = last_name;
		}
		
		if (date_of_birth != null) {
		this.date_of_birth = date_of_birth;
		}
		
		if (gender != null) {
		this.gender = gender;
		}
		
		LocalDate today = LocalDate.now();
		
		if (today != null && date_of_birth != null) {
		age = Period.between(date_of_birth, today).getYears();
		}
	}
	
	public int getAge() {
		return age;
	}
	

}
