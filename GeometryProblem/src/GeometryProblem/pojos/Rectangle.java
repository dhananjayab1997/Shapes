package GeometryProblem.pojos;

public class Rectangle  extends Shape{
	private double height;
	private double width;
	private double perimeter;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String type;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	} 
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		if (this.getHeight()!=0 && this.getWidth()!=0) {
			double areaReactangle =this.getHeight()*this.getWidth();
			return areaReactangle;
		}
		return 0;
	}
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		if (this.getHeight()!=0 && this.getWidth()!=0) {
			double areaReactangle =2.0*(this.getHeight()+this.getWidth());
			return areaReactangle;
		}
		return 0;
	}
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Height: "+this.getHeight() + "Width: "+this.getWidth()); 
	}
	@Override
	public double drawShape() {
		// TODO Auto-generated method stub
		return 0;
	}
}
