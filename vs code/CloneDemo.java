// Demonstrates the clone() method
class TestClone implements Cloneable {
    int a;
    double b;
    CloneDemo cd;
    TestClone(CloneDemo cd) {
        this.cd = cd;
    }
    //This method calls Object's clone()
    TestClone cloneTest() {
        try {
            // call clone in Object.
            return (TestClone) super.clone();
        }   catch(CloneNotSupportedException exc) {
            System.out.println("Cloning not allowed.");
        }
        return null;
    }
} 

class CloneDemo {
    int a = 10, b = 5;
    public static void main(String[] args) {
        CloneDemo cd = new CloneDemo();
        TestClone x1 = new TestClone(cd);
        TestClone x2;

        x1.a = 10;
        x1.b = 20.98;

        x2 = x1.cloneTest(); // clone x1
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
        System.out.println("CloneDemo a: " +x1.cd.a + ", CloneDemo b: " + x2.cd.b);
        x2.cd.a = 5; x1.cd.b = 10;
        System.out.println("After change:\tCloneDemo a: " +x1.cd.a + ", CloneDemo b: " + x2.cd.b);
    }
}