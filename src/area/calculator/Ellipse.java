package area.calculator;

public class Ellipse extends GeometricalFigure {

	private double a; // semi-major axis length
	private double b; // semi-minor axis lenght

	public void info(double a, double b) {
		
		this.geometricalName("Ellipse ");
		this.a = a;
		this.b = b;
		
	}

	@Override
	public double areaCalculator() {

		return Math.PI * a * b;
		
	}

}
