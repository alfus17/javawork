package _02_abstract;

public class PetRun {
	public static void main(String[] args) {
//		Cat cat1 = new Cat();
//		Dog dog1 = new Dog();
//		
//		System.out.println(cat1);
//		System.out.println(dog1);
//		
//		cat1.info();
//		dog1.info();
//		
		Pet pet = new Cat("","","");
		Dog pet2 = (Dog) pet;
		System.out.println(pet);
		pet.info();
		
		pet = new Dog();
		System.out.println(pet);
		pet.info();
		
		
		
	
	}

}
