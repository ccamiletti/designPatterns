package cl.ccs.patterns.creational.builder.standar;

public class House {

	
	private int rooms;
	private int bathRooms;
	private int bedRooms;
	private boolean yard;
	
	public static class HouseBuilder {
		
		private int rooms;
		private int bathRooms;
		private int bedRooms;
		private boolean yard;
		
		public HouseBuilder rooms(int rooms) {
			this.rooms = rooms;
			return this;
		}

		public HouseBuilder bathRooms(int bathRooms) {
			this.bathRooms = bathRooms;
			return this;
		}

		public HouseBuilder bedRooms(int bedRooms) {
			this.bedRooms = bedRooms;
			return this;
		}

		public HouseBuilder yard(boolean yard) {
			this.yard = yard;
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
