public class MonomialExp implements Expression {
    private double a;
    private double n;

    MonomialExp(double a, double n) {
        this.a = a;
        this.n = n;
    }
    public double evaluate(double x) {
        return Math.pow(a*x, n);
    }

    public Expression derive() {
        return new MonomialExp(this.a*n, this.n - 1);
    }

    public String toString() {
        return Double.toString(this.a) + "x^" + Double.toString(this.n);
    }
}
