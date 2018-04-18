package cl.ccs.patterns.structural.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		
		
		Vehicle v = new Car();
		v.accelerate();
		v = new Bus();
		v.accelerate();

		v = new BicycleAdapter(new Bicycle());
		v.accelerate();
		

	}

}
