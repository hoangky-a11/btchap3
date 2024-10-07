// MyPolynomial.java
public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (i != getDegree()) sb.append(" + ");
            sb.append(coeffs[i]);
            if (i != 0) sb.append("x^").append(i);
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i <= getDegree(); i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial other) {
        int maxDegree = Math.max(this.getDegree(), other.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];
        for (int i = 0; i <= maxDegree; i++) {
            newCoeffs[i] = this.getCoeff(i) + other.getCoeff(i);
        }
        return new MyPolynomial(newCoeffs);
    }

    private double getCoeff(int index) {
        if (index > this.getDegree()) return 0;
        return coeffs[index];
    }
}
