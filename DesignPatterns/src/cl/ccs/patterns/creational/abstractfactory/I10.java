package cl.ccs.patterns.creational.abstractfactory;

public class I10 implements Car {

	@Override
	public void drive() {
		System.out.println("driving " + I10.class.getName());
		
	}

}
