// class Rectangle
class Rectangle{
	double length, width;

	//Constructor with parameters
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	//Method to compute area of rectangle 
	double AreaOfRec(){
		return length * width;
	}

	//Method to compute perimeter of rectangle
	double PerOfRec(){
		return 2 * (length + width);
	}

}

// class Circle
class Circle{
	double radius;

	//Constructor of class Circle 
	Circle(double radius){
		this.radius = radius;
	}

	//Method to compute area of circle
	double AreaOfCir(){
		return 22.0/7 * radius * radius;
	}

	//Method to compute circumference of circle
	double Circumference(){
		return 2 * 22.0/7 * radius;
	}
}

//class from which the execution starts
class MultipleClasses{
	public static void main(String array[]){
		//Creating an object of class Rectangle
		Rectangle rec1 = new Rectangle(20.0 , 40.0);

		//Creating an object of class Circle
		Circle c1 = new Circle(77.0);

		//Invoking the respective methods and printing area and perimeter of Rectangle
		System.out.println("Area of rectangle: " + rec1.AreaOfRec() + "\nPerimeter of rectangle: " + rec1.PerOfRec() + "\n");

		//Calling the respective methods and printing the area and circumference of Circle
		System.out.println("Area of circle: " + c1.AreaOfCir() + "\nCircumference of circle: " + c1.Circumference() + "\n");
	}
}