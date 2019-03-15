package kristinhesse.ch13;

import java.util.Date;

public class Reptile extends Pet implements Mobility{
	private String type;
	
	public Reptile(String name, char gender, Date dateAcquired, String type) {
		super(name, gender, dateAcquired);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override
	public void move() {
		System.out.println("Walks slowly");
		
	}

	@Override
	public void sound() {
		System.out.println("Does not make sound");
	}

	@Override
	public String toString() {
		return "Reptile type=" + type + ", toString()=" + super.toString() + " ";
	}
	
	/*@Override
	public String toString() {
		return "Reptile type=" + type + " ";
	}*/
	
}
