public class ConstructorRefDemo {
    public static void main(String[] args) {
        
        //Create a reference to the MyClass constructor. Because func() in ConsDemo takes an argument, new 
        //refers to the parameterized constructor in MyClass, not the default constructor.

        ConsDemo myClassCons = MyClass :: new;

        //Create an instance of MyClass via that constructor reference.
        MyClass mc = myClassCons.func(100);

        //Use the instance of MyClass just created.
        System.out.println("val in mc is " + mc.getValue());
        System.out.println(mc.getClass().getName() + "\n" + myClassCons.getClass().getName());
    }
}

interface ConsDemo {
    MyClass func(int n);
}

class MyClass {
    private int val;

    MyClass(int v) { val = v;}

    MyClass() {val = 0;}

    int getValue() { return val;}
}