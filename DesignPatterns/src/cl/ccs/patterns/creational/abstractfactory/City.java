package cl.ccs.patterns.creational.abstractfactory;

public class City implements Car {

	@Override
	public void drive() {
		System.out.println("Driving " + City.class.getName());
	}

}
