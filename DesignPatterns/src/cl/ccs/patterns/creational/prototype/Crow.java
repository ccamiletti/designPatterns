package cl.ccs.patterns.creational.prototype;

public class Crow implements Animal {

	private String name = null;
	
	@Override
	public Animal makeCopy() {

		Crow crow = null;
				
		try {
			crow = (Crow) super.clone();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return crow;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "i am a litle crow";
	}

}
