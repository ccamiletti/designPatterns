package cl.ccs.patterns.creational.abstractfactory2;

public class AbstractFactoryTest2 {

	public static void main(String[] args) {
		
		System.out.println(CarFactory.buildCar(CarType.MICRO, Location.DEFAULT));
        System.out.println(CarFactory.buildCar(CarType.MINI,  Location.INDIA));
        System.out.println(CarFactory.buildCar(CarType.LUXURY,  Location.USA));
	}

}
