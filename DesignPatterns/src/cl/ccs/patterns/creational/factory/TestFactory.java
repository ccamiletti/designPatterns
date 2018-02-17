package cl.ccs.patterns.creational.factory;

public class TestFactory {

	public static void main(String[] args) {
		
		
		try {
			
			AniamlFactory factory = new AniamlFactory();
			
			Animal animal = factory.getAnimal("DOG");
			System.out.println(animal.eat());
			animal = factory.getAnimal("CAT");
			System.out.println(animal.eat());
			animal = factory.getAnimal("HORSE");
			System.out.println(animal.eat());
			
		}catch(Exception e) {
			
		}
		

	}
	

}
