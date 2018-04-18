package cl.ccs.patterns.creational.builder.lambda;

import java.util.function.Consumer;

public class House {

	
	private int rooms;
	private int bathRooms;
	private int bedRooms;
	private boolean yard;
	
	public static class HouseBuilder {
		
		public int rooms;
		public int bathRooms;
		public int bedRooms;
		public boolean yard;
		
		public HouseBuilder with(Consumer<HouseBuilder> builderFunction) {
	        builderFunction.accept(this);
	        return this;
	    }
	
		public House builder() {
			return new House(this);
		}
	}
	
	private House(HouseBuilder hb) {
		this.bedRooms = hb.bedRooms;
		this.bathRooms = hb.bathRooms;
		this.rooms = hb.rooms;
		this.yard = hb.yard;
	}

	@Override
	public String toString() {
		return "House [rooms=" + rooms + ", bathRooms=" + bathRooms + ", bedRooms=" + bedRooms + ", yard=" + yard + "]";
	}
	
}
