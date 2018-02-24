package area.calculator;

public class Triangle extends GeometricalFigure {

	private double h; //h is the height
	private double b; //b is the base

	public void info(double h, double b) {
		
		this.geometricalName("Triangle ");
		this.h = h;
		this.b = b;
		
	}

	@Override
	public double areaCalculator() {
		
		return (b * h) / 2;
		
	}

}
