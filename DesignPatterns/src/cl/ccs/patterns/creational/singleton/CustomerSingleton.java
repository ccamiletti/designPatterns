package cl.ccs.patterns.creational.singleton;

public class CustomerSingleton {

	
	private String name;
	
	private static CustomerSingleton INSTANCE;
	
	private CustomerSingleton() {}
	
	public static CustomerSingleton getInstance() {
		
		if (null == INSTANCE) {
			INSTANCE = new CustomerSingleton();
		}
		
		return INSTANCE;
		
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
