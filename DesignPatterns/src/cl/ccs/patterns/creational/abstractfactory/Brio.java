package cl.ccs.patterns.creational.abstractfactory;

public class Brio implements Car {

	@Override
	public void drive() {
		System.out.println("driving " + Brio.class.getName());

	}

}
