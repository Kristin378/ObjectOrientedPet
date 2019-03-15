package kristinhesse.ch13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public abstract class Pet {
	private String name;
	private char gender;
	private java.util.Date dateAcquired;
		
	public Pet(String name, char gender, Date dateAcquired) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateAcquired = dateAcquired;
	}
	
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	
	public java.util.Date getDateAcquired() {
		return dateAcquired;
	}
	
	public void sound() {
		System.out.println(" ");
	}
	/*public String sound() {
		return sound();
	}
	public String move() {
		return move();
	}*/

	@Override
	public String toString() {
		return "Pet name=" + name + ", gender=" + gender + ", dateAcquired=" + dateAcquired + " ";
	}	
	
}
