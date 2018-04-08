package cl.ccs.patterns.creational.abstractfactory;

public class HyundayCarFactory implements CarFactory {

	@Override
	public Car createCar(String carType) {
		Car car = null;
		
		if ("I10".equalsIgnoreCase(carType)) {
			car = new I10();
		}else if ("I20".equalsIgnoreCase(carType)) {
			car = new I20();
		}
		
		return car;
	}


}
