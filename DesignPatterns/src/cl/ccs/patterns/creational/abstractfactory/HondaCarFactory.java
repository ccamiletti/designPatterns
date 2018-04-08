package cl.ccs.patterns.creational.abstractfactory;

public class HondaCarFactory implements CarFactory {

	@Override
	public Car createCar(String carType) {
		Car car = null;
		
		if ("BRIO".equalsIgnoreCase(carType)) {
			car = new Brio();
		}else if ("CITY".equalsIgnoreCase(carType)) {
			car = new City();
		}
		
		return car;
	}

}
