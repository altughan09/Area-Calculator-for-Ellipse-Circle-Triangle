package area.calculator;

public class AreaCalculator {

	public static void main(String[] args) {
		
		Triangle tr = new Triangle();
		Circle cr = new Circle();
		Ellipse el = new Ellipse();
		
		tr.info(5.0, 6.0);
		System.out.println(tr.getGeometricalName()+"area:");
		System.out.println(tr.areaCalculator());
		
		cr.info(5.0);
		System.out.println(cr.getGeometricalName()+"area:");
		System.out.println(cr.areaCalculator());
		
		el.info(5.0, 6.0);
		System.out.println(el.getGeometricalName()+"area:");
		System.out.println(el.areaCalculator());
	}

}
