package cl.ccs.patterns.structural.bridge;

public class Rectangle extends Figure {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("drawing a rectangle...!!!");
		super.color.paint();
	}

}
