package cl.ccs.patterns.structural.adapter1;

public class IphoneAdapter implements Charger {

	
	private Iphone iphone;
	
	public IphoneAdapter(Iphone i) {
		this.iphone = i;
	}
	
	public void charge() {
		this.iphone.chargerMyIphone();
		
	}

	
	
	
}
