package GeometryProblem.ui;

import java.util.Scanner;

import GeometryProblem.pojos.Circle;
import GeometryProblem.pojos.Rectangle;
import GeometryProblem.pojos.Square;

public class Geometry {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intTarget;
		Geometry geo = new Geometry();
		do {
			System.out.println("Please enter the below option\n1-Rectangle\n2-Square\n3-Circle\n0-Exit");
			intTarget =s.nextInt();
			switch(intTarget) {
				case 1:
					geo.reactangleProcess();
					break;
				case 2:
					geo.squareProcess();
					break;
				case 3:
					geo.circleProcess();
					break; 
			}
		}while(intTarget!=0);
	}
  public void reactangleProcess() {
	  Rectangle recAng = new Rectangle(); 
	  int intRecChoice;
	  do {
		  System.out.println("Please enter\n1-Calculate area\n2-calculate perimeter\n3-display details\n4-draw shape\n0-Exit from reactangle process!");
		  intRecChoice = s.nextInt();
		  switch(intRecChoice){
		  case 1:
			  System.out.println("Enter the height:");
			  recAng.setHeight(s.nextDouble());
			  System.out.println("Enter the width:");
			  recAng.setWidth(s.nextDouble());
			  recAng.setArea(recAng.calculateArea());
			  System.out.println("Area of Reactangle is:" + recAng.getArea());
			  break;
		  case 2:
			  System.out.println("Enter the height:");
			  recAng.setHeight(s.nextDouble());
			  System.out.println("Enter the width:");
			  recAng.setWidth(s.nextDouble());
			  recAng.setPerimeter(recAng.calculatePerimeter());
			  System.out.println("Area of Reactangle is:" + recAng.getPerimeter());
			  break;
		  case 3:recAng.calculateArea();break;
		  case 4:break;
		  }
	  }while(intRecChoice!=0);
	  
  }
  public void squareProcess() {
	  Square seqAng =new Square(); 
	  int intSquChoice;
	  do {
		  System.out.println("Please enter\n1-Calculate area\n2-calculate perimeter\n3-display details\n4-draw shape\n0-Exit from square process!");
		  intSquChoice = s.nextInt();
		  switch(intSquChoice)
		  { 
			  case 1:
				  System.out.println("Enter the side:");
				  seqAng.setSide(s.nextDouble()); 
				  seqAng.setArea(seqAng.calculateArea());
				  System.out.println("Area of Reactangle is:" + seqAng.getArea());
				  break;
			  case 2:
				  System.out.println("Enter the side:");
				  seqAng.setSide(s.nextDouble()); 
				  seqAng.setPerimeter(seqAng.calculatePerimeter());
				  System.out.println("Area of Reactangle is:" + seqAng.getPerimeter());
				  break;
			  case 3:seqAng.displayDetails();break;
			  case 4:break;
		  } 
	  }while(intSquChoice!=0);
	  
  }
  public void circleProcess() {
	  Circle cirAng =new Circle(); 
	  int intCircleChoice;
	  do {
		  System.out.println("Please enter\n1-Calculate area\n2-display details\n3-draw shape\n0-Exit from circle process!");
		  intCircleChoice = s.nextInt();
		  switch(intCircleChoice)
		  {
			  case 1:
				  System.out.println("Enter the side:");
				  cirAng.setRadius(s.nextDouble()); 
				  cirAng.setArea(cirAng.calculateArea());
				  System.out.println("Area of Reactangle is:" + cirAng.getArea());
				  break;
			  //case 2:break;
			  case 2:
				  cirAng.displayDetails();
				  break;
			  case 3:break;
		  } 
	  }while(intCircleChoice!=0);
	  
  }
}
