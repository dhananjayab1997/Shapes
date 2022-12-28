package GeometryProblem.pojos;

public abstract class Shape {
	private double area;
	private String color;
	private double perimeter;
	private String type;
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	protected abstract double calculateArea();
	protected abstract double calculatePerimeter();
	protected abstract double drawShape();
	protected abstract void displayDetails();
	
}
