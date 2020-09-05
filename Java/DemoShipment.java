// Extend BoxWeight to include shipping costs

// Start with Box
class Box{
	private double width;
	private double height;
	private double depth;

	//construct clone of an object
	Box(Box ob){//pass an object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	//constructor used when all the dimensions specified
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}

	//constructor used when no dimensions are specified
	Box(){
		width = -1; depth = -1; height = -1;
	}

	//constructor used for cube
	Box(double len){
		width = depth = height = len;
	}

	//method for returning volume of box
	double volume(){
		return width * height * depth;
	} 
}

//Add weight
class BoxWeight extends Box{
	double weight; // weight of box

	//construct clone of an object
	BoxWeight(BoxWeight ob){// pass object of BoxWeight to constructor
		super(ob);
		weight = ob.weight;
	}

	//constructor used when all parameters are specified
	BoxWeight(double w, double h, double d, double wt){
		super(w, h, d); // calls constructor of its immediate superclass Box
		weight = wt;
	}

	//constructor used when no parameters are specified
	BoxWeight(){
		super(); // calls superclass construcotr
		weight = -1;
	}

	//constructor for creating cube
	BoxWeight(double len, double wt){
		super(len); // calls the corresponding constructor of its superclass
		weight = wt;
	}
}

//Add shipment costs
class Shipment extends BoxWeight{
	double cost; // adds cost of shipment

	//construct clone of an object
	Shipment(Shipment ob){//pass object to constructor
		super(ob);// calls corresponding constructor of its immediate superclass, i.e., BoxWeight
		cost = ob.cost;
	} 

	//constructor used when all the parameters are specified
	Shipment(double w, double h, double d, double wt, double cost){
		super(w, h, d, wt);// calls corresponding constructor of its immediate superclass, i.e., BoxWeight
		this.cost = cost;
	}

	//constructor used when no parameters are provided
	Shipment(){
		super();// calls corresponding constructor of its immediate superclass, i.e., BoxWeight
		cost = -1;
	}

	//constructor for creating cube
	Shipment(double len, double wt, double cost){
		super(len, wt);// calls corresponding constructor of its immediate superclass, i.e., BoxWeight
		this.cost = cost;
	}
}

class DemoShipment{
	public static void main(String[] args){
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 2.41);
		Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

		System.out.println("Volume of shipment1 is " + shipment1.volume());
		System.out.println("Weight of shipment1 is " + shipment1.weight);
		System.out.println("Shipping cost: $" + shipment1.cost);

		System.out.println("\nVolume of shipment1 is " + shipment2.volume());
		System.out.println("Weight of shipment1 is " + shipment2.weight);
		System.out.println("Shipping cost: $" + shipment2.cost);
	}
}