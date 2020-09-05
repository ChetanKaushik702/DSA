/*A program that uses the Box class
  Call this file BoxDemo.java*/

 class Box{
 	double width;
 	double height;
 	double length;
 } 

 // Class that contains main() method
 class BoxDemo{
 	public static void main(String[] args){
 		Box mybox = new Box();
 		//Initialises the copy of instance variables for the instance mybox
 		mybox.width = 10.0;
 		mybox.height = 20.0;
 		mybox.length = 15.0;

 		double volume = mybox.width * mybox.height * mybox.length ;
 		System.out.println("Volume is " + volume);

 	}
 }