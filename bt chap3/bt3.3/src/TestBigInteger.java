import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger num2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        // Addition
        System.out.println("Addition: " + num1.add(num2));

        // Multiplication
        System.out.println("Multiplication: " + num1.multiply(num2));
    }
}
