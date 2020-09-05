// Sub-package demo
package mypack;
// abstract class declares only the definition of methods 
abstract class Interest{
	double principal, roi, time;

	Interest(double p, double r, double t){
		principal = p; roi = r; time = t;
	}

	abstract double interest();

	abstract double amount();

}

class SimpleInterest extends Interest{
	//Constructor for SimpleInterest class
	SimpleInterest(double p, double r, double t){
		super(p, r, t); // calls constructor of its immediate superclass, i.e., Interest
	}

	//defines the abstract method
	double interest(){
		return super.principal * super.roi * super.time / 100;
	}

	double amount(){
		double extramoney = interest();
		return super.principal + extramoney; 
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

	//defines amount method
	double amount(){
		double extramoney = interest();
		return extramoney + super.principal;
	}
}

public class CalculateInterest{
	public static void main(String[] args){

		SimpleInterest sm = new SimpleInterest(10000,8,25);
		CompoundInterest cm = new CompoundInterest(10000,10,12);

		System.out.print("Simple Interest : " + sm.interest() + "\nCompound Interest : " + cm.interest() + "\n");
		System.out.println("Money made by simple interest in " + sm.time + "years : Rs." + sm.amount() + "\nMoney made by compound interest in " + cm.time + "years : Rs." + cm.amount());
	}
}