import static java.lang.Math.random;
interface Number {
  double getValue();
}

class Main {
  public static void main(String[] args) {
    Number n;

    n = () -> random() * 100;
    long beg = System.currentTimeMillis();
  for(int i=0; i<100000; i++)
    System.out.println(i + ": " + n.getValue());
  }
  long end = System.currentTimeMillis();

  System.out.println(end - beg);
}