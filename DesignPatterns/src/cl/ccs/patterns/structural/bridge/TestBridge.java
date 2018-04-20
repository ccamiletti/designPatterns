package cl.ccs.patterns.structural.bridge;

public class TestBridge {

	public static void main(String[] args) {


		Figure f = new Circle(new Black());
		f.draw();
		f = new Rectangle(new Red());
		f.draw();
		
		

	}

}
