package cl.ccs.patterns.structural.bridge;

public abstract class Figure {

	protected Color color;
	
	public Figure(Color color) {
		this.color = color;
	}
	
	
	public abstract void draw();
	
}
