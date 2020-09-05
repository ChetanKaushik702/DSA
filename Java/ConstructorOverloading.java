/* Here, Box defines three constructors to initialise
   the dimensions of a box in various ways.
*/
class Box{
	double width, height, length;

	//constructor used when all dimensions specified
	Box(double w, double h, double l){
		width = w;
		height = h;
		length = l;
	}

	//constructor used when no dimensions specified
	Box(){
		width = length = height = -1; // intialised by -1
	}

	//constructor used when cube is created
	Box(double len){
		width = length = height = len;
	} 

	//compute and return volume
	double volume(){
		return width * height * length;
	}
}

class ConstructorOverloading {
	public static void main(String args[]){
		//creates boxes using the various constructors
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mybox3 = new Box(7);

		//get volume of first box
		System.out.println("Volume of mybox1: " + mybox1.volume());

		//get volume of second box
		System.out.println("Volume of mybox2: " + mybox2.volume());

		//get volume of cube
		System.out.println("Volume of cube: " + mybox3.volume());
	}
}