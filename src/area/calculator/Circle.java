package area.calculator;

public class Circle extends GeometricalFigure {

	private double r;
	
	public void info(double r) {
		
		this.geometricalName("Circle ");
		this.r=r;
		
	}

	
	@Override
	public double areaCalculator() {
		
		return Math.PI*Math.sqrt(r);
	}
	
}
