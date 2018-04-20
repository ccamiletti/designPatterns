package cl.ccs.patterns.structural.bridge;

public class Circle extends Figure {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		
		System.out.println("drawing a Circle...!!!");
		super.color.paint();

	}

}
