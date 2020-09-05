public class DoubleDemo {
    public static void main (String[] args) {

        Double d1 = Double.valueOf(3.14159);
        Double d2 = Double.valueOf("314159e-5");

        System.out.println(d1 + "\n" + d2 + "\nDouble.BYTES is " + Double.BYTES);
        System.out.print("Maximum value that can be stored in a double: " + Double.MAX_VALUE + "\nMinimum value" +
        " that can be stored in a double: " + Double.MIN_VALUE);

        System.out.println("POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY + "\nNEGATIVE_INFINITY: " + Double.NEGATIVE_INFINITY);

    }
    
}