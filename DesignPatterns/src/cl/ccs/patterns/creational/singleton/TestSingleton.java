package cl.ccs.patterns.creational.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		
		TestSingleton t1 = new TestSingleton();
		TestSingleton t2 = new TestSingleton();

		t1.setName("carlo");
		System.out.println("name to T1 before set T2: " + t1.getName());
		
		t2.setName("carlo2");
		System.out.println("name to T2: " + t2.getName());
		System.out.println("name to T1 after set T2: " + t1.getName());
		
	}
	
	public String getName() {
		
		CustomerSingleton singleton = CustomerSingleton.getInstance();
		return singleton.getName();
		
	}
	
	
	public void setName(String name) {
		
		CustomerSingleton singleton = CustomerSingleton.getInstance();
		singleton.setName(name);
		
	}
	

}
