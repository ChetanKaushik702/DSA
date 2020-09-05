// Demonstrate toDegrees() and toRadians().
class Angles {
    public static void main(String[] args) {
        double theta = 120.0;

        System.out.println(theta + " degrees is " + StrictMath.toRadians(theta) + " radians.");
        theta = 1.0;
        System.out.println(theta + " radians is " + StrictMath.toDegrees(theta) + " degrees.");
    }
}