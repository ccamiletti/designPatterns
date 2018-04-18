package cl.ccs.patterns.structural.adapter;

public class BicycleAdapter implements Vehicle {

	
	private Bicycle bycicle;
	
	public BicycleAdapter(Bicycle bicycle) {
		this.bycicle = bicycle;
	}
	
	@Override
	public void accelerate() {
		
		bycicle.go();
		
	}

}
