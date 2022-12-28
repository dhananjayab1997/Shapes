package GeometryProblem.pojos;

public class Circle extends Shape{
	private double radius;
	public final double pi=3.142;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		if(this.getRadius()!=0) {
			double areaOfCircle = pi * this.getRadius() * this.getRadius();
			return areaOfCircle;
		}
		return 0;
	}@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public void displayDetails() {
		// TODO Auto-generated method stub 
		System.out.println("Radius: " + this.getRadius());
	}@Override
	public double drawShape() {
		// TODO Auto-generated method stub
		return 0;
	}
}
