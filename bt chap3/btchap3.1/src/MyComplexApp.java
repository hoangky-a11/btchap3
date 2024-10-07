
import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();

        MyComplex num1 = new MyComplex(real1, imag1);
        MyComplex num2 = new MyComplex(real2, imag2);

        System.out.println("Number 1 is: " + num1);
        System.out.println(num1 + " is " + (num1.isReal() ? "a pure real number" : "NOT a pure real number"));
        System.out.println(num1 + " is " + (num1.isImaginary() ? "a pure imaginary number" : "NOT a pure imaginary number"));

        System.out.println("Number 2 is: " + num2);
        System.out.println(num2 + " is " + (num2.isReal() ? "a pure real number" : "NOT a pure real number"));
        System.out.println(num2 + " is " + (num2.isImaginary() ? "a pure imaginary number" : "NOT a pure imaginary number"));


        System.out.println(num1 + " is " + (num1.equals(num2) ? "equal" : "NOT equal") + " to " + num2);

        MyComplex sum = num1.addNew(num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}
