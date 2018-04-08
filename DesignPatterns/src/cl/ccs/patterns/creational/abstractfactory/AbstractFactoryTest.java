package cl.ccs.patterns.creational.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String... args) {
		
		CarFactory honda = FactoryProducer.getCarFactory("HONDA");
		Car brio = honda.createCar("BRIO");
		brio.drive();
		Car city = honda.createCar("CITY");
		city.drive();

		CarFactory hyundai = FactoryProducer.getCarFactory("HYUNDAI");
		Car i10 = hyundai.createCar("I10");
		i10.drive();
		Car i20 = hyundai.createCar("I20");
		i20.drive();

	}
	
}
