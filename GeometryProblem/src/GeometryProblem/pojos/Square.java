package GeometryProblem.pojos;

public class Square extends Shape{
	private double side;  
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		if(this.getSide()!=0) {
			double areaOfSquare = this.getSide() * this.getSide();
			return areaOfSquare;
		}
		return 0;
	}@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		if(this.getSide()!=0) {
			double perimeterOfSquare = this.getSide() * this.getSide();
			return perimeterOfSquare;
		}
		return 0;
	}@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("the Side:"+this.getSide()); 
	}@Override
	public double drawShape() {
		// TODO Auto-generated method stub
		return 0;
	}
}
