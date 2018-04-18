package cl.ccs.patterns.creational.builder.lambda;

public class TestBuilderLambda {

	public static void main(String[] args) {

		House house = new House.HouseBuilder()
		        .with($ -> {
		        	$.rooms = 1;
		        	$.bathRooms = 1;
		        	$.bedRooms = 3;
		        	
		        }).with($ -> $.yard = true).builder();

		System.out.println(house);
		
	}

}
