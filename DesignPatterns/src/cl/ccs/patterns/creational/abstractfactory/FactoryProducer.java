package cl.ccs.patterns.creational.abstractfactory;

public class FactoryProducer {

	
	public static CarFactory getCarFactory(String factoryType) {
		
		CarFactory carFactory = null;
		
		if ("HYUNDAI".equalsIgnoreCase(factoryType)) {
			carFactory = new HyundayCarFactory();
		}else if ("HONDA".equalsIgnoreCase(factoryType)) {
			carFactory = new HondaCarFactory();
		}
		
		return carFactory;

		
		
	}
	
}
