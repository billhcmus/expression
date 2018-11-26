public class MonomialExp implements Expression {
    private double a;
    private double n;
    public static Expression createInstance(double a, double n) {
        if (a == 0) {
            return new ConstExp(0);
        }
        if (n == 0) {
            return new ConstExp(a);
        }
        return new MonomialExp(a, n);
    }

    private MonomialExp(double a, double n) {
        this.a = a;
        this.n = n;
    }

    public double evaluate(double x) {
        return Math.pow(a*x, n);
    }

    public Expression derive() {
        return new MonomialExp(this.a*n, this.n - 1);
    }

    public String toString(Notation nt) {
        if (this.n == 0) {
            return Double.toString(this.a);
        } else if (this.n == 1) {
            return this.a + "x";
        }
        return this.a + "x^" + this.n;
    }
}
