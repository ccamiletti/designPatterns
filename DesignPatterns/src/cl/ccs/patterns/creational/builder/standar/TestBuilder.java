package cl.ccs.patterns.creational.builder.standar;

public class TestBuilder {

	public static void main(String[] args) {

		House h = new House.HouseBuilder()
				.bathRooms(3)
				.bedRooms(3)
				.rooms(5)
				.yard(true)
				.builder();
		
		System.out.println(h.toString());

	}

}
