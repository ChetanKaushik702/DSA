// Sub-package demo
package mypack;
import java.util.*;
// abstract class declares only the definition of methods 
abstract class Interest{
	double principal, roi, time;

	Interest(double p, double r, double t){
		principal = p; roi = r; time = t;
	}

	abstract double interest();

}

class SimpleInterest extends Interest{
	//Constructor for SimpleInterest class
	SimpleInterest(double p, double r, double t){
		super(p, r, t); // calls constructor of its immediate superclass, i.e., Interest
	}

	//defines the abstract method
	double interest(){
		return super.principal * super.roi * super.time;
	}
}

class CompoundInterest extends Interest{
	//Constructor for CompoundInterest class
	CompoundInterest(double p, double r, double t){
		super(p, r, t); // calls constructor of its immediate superclass, i.e., Interest
	}

	//defines interest method
	double interest(){
		return ((super.principal * Math.pow((1 + super.roi/100), super.time)) - super.principal);
	}
}

class CalculateInterest{
	public static void main(String[] args){
		SimpleInterest sm = new SimpleInterest(100,10,2);
		CompoundInterest cm = new CompoundInterest(100,10,2);

		System.out.print("Simple Interest : " + sm.interest() + "\nCompound Interest : " + cm.interest());
	}
}