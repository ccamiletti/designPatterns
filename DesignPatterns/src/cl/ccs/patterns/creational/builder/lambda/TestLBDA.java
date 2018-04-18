package cl.ccs.patterns.creational.builder.lambda;

public class TestLBDA {

	public static void main(String[] args) {


		House house = new House.HouseBuilder().with(
				builder -> {
					builder.bathRooms = 3;
					builder.bedRooms = 4;
					builder.rooms = 7;
					builder.yard = Boolean.FALSE;
				}	
		).builder();

		
		System.out.println(house);
		
	}

}
