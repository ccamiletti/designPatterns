package cl.ccs.patterns.structural.adapter1;

public class TestAdapter {

	
	public static void main(String...strings) {
		
		Charger ch = new Android();
		ch.charge();
		
		ch = new IphoneAdapter(new Iphone());
		ch.charge();
	}
	
	
}
