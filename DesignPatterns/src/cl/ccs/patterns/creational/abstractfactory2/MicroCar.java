package cl.ccs.patterns.creational.abstractfactory2;

public class MicroCar extends Car {

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Connecting to Micro Car ");
	}

}
