package cl.ccs.patterns.structural.adapter;

public class Bus implements Vehicle {

	@Override
	public void accelerate() {
		
		System.out.println("bus is acelerating");
		
	}

}
