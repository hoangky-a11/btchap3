// TestMyPolynomial.java
public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(3.3, 4.4, 5.5);

        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        System.out.println("Evaluation of Polynomial 1 at x=2: " + p1.evaluate(2));

        MyPolynomial sum = p1.add(p2);
        System.out.println("Sum of Polynomial 1 and 2: " + sum);
    }
}
