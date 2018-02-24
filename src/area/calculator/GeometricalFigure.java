package area.calculator;

public abstract class GeometricalFigure {
	
	private String name;
	
	public void geometricalName(String name) {
		this.name=name;
	}
	
	public String getGeometricalName() {
		return this.name;
	}
	
	public abstract double areaCalculator();
}
