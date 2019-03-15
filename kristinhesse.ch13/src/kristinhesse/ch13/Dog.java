package kristinhesse.ch13;

import java.util.Date;

import kristinhesse.ch13.TestPet;

public class Dog extends Pet implements Mobility {
	private String breed;
	private int weight;
	
	public Dog(String name, char gender, Date dateAcquired, String breed, int weight) {
		super(name, gender, dateAcquired);
		this.breed = breed;
		this.weight = weight;
	}
		
	public String getBreed() {
		return breed;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void move() {
		System.out.println("Walks on a leash");
	}
	@Override
	public void sound() {
		System.out.println("Bark, Bark"); ;
		
	}
	
	/*public int compareTo(Dog Arg0) {
		if (weight > Arg0.weight) {
			return 1;
		}
		else if(weight < Arg0.weight) {
			return -1;
		}
		else {
			return 0;
		}
		
	}*/
	public int compareTo(Dog doggies) {
		
		if (weight > doggies.weight)
	      return 1;
	    else if (weight < doggies.weight)
	      return -1;
	    else
	      return 0;
	  }

	@Override
	public String toString() {
		return "Dog breed=" + breed + ", weight=" + weight + ", toString()=" + super.toString() + "Walks on a leash, " + "Bark, Bark";
	}
	
	/*@Override
	public String toString() {
		return "Dog breed=" + breed + ", weight=" + weight + " ";
	}*/
	
	/*public void compareTo(Dog arg0) {
		return;*/
	/*}*/
	/*@Override
	public String toString() {
		return "Dog breed=" + breed + ", weight=" + weight + "";
	}*/
	
	

}
