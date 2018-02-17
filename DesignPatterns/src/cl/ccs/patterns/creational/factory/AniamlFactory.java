package cl.ccs.patterns.creational.factory;

public class AniamlFactory {

	
	public Animal getAnimal(String animalParam) {
		
		Animal animal = null;
		if ("HORSE".equalsIgnoreCase(animalParam)) {
			animal = new Horse();
		}else if ("CAT".equalsIgnoreCase(animalParam)) {
			animal = new Cat();
		}else if ("DOG".equalsIgnoreCase(animalParam)) {
			animal = new Dog();
		}
		
		return animal;
		
	}
	
}
