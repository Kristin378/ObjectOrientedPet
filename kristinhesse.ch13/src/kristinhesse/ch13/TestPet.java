package kristinhesse.ch13;

import java.util.Arrays;
import java.util.Date;
import java.util.ArrayList;
public class TestPet {

	public static void main(String[] args) {
	
		Date date = new Date (2007, 7, 5, 17,06,54);
		Date date1 = new Date (2016, 10, 15, 18, 36, 12);
		Date date2 = new Date (2004, 12, 25, 11, 21, 8);
		Date date3 = new Date (2011, 9, 11, 10, 18, 9);
		Date date4 = new Date (2013, 11, 28, 7, 41, 10);
		
		
		
		
		Reptile michaelangelo = new Reptile("Michaelangelo", 'M', date, "tortoise");
		System.out.println(michaelangelo);
		
		michaelangelo.move();
		michaelangelo.sound();
		
		
		Dog pet1 = new Dog("Fido", 'M', date1, "Labrador", 98);
		Dog pet2 = new Dog("Buddy", 'M', date2, "Pitbull", 75);
		Dog pet3 = new Dog("Patches", 'F', date3, "Border Collie", 96);
		Dog pet4 = new Dog("Roscoe", 'F', date4, "Beagle", 84);
		
				
		Object[] doggies = {pet1, date1, pet2, date2, pet3, date3, pet4, date4};
		 
		
		Integer[] array = {96, 98, 75, 84};
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
		java.util.Collections.sort(list);
		System.out.println(list);
		System.out.println(" Buddy\n" + " Roscoe\n" + " Patches\n" + " Fido\n");
		/*Arrays.sort(doggies, args, 0);*/
		
		/*String [] doggies = {"dog1", "dog2", "dog3", "dog4"};*/
		/*java.util.Arrays.sort(doggies);*/
		
		/*java.util.Arrays.sort(doggies);*/
		
		/*Arrays.sort(doggies);*/
		for (Object Dog : doggies)
			System.out.println(Dog + " ");
		
		System.out.println();
		
		/*for (int i = 0; i < doggies.length; i++) {
			System.out.print(doggies[i] + " ");
			
		}
		
		ArrayList<Object> d = new ArrayList<Object>(Arrays.asList(doggies));
		System.out.println(doggies);
		for (Object o : doggies) {
			System.out.println(o);*/
		
		/*java.util.AbstractCollection<Dog>(int.Dog(int, weight);{
			
		}*/
		
			/*Arrays.sort(doggies);*/
		
			
		/*Collections.sort(doggies);*/
		
		/*for(int i = 0; i < doggies.length; i++)
			System.out.print(doggies.length + "\n");
		System.out.println();*/
		
		/*for(Pet p: doggies) {
			System.out.println(p);
		}*/
		

	}

	private static int[] doggies(Class<Integer> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
		
	}

