package cl.ccs.patterns.creational.abstractfactory2;

public class MiniCar extends Car {

	public MiniCar(Location location) {
        super(CarType.MINI,location );
        construct();
    }
     
    @Override
    public void construct() {
        System.out.println("Connecting to Mini car");
    }
}
