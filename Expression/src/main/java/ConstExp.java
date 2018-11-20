public class ConstExp implements Expression {
    private double value;

    ConstExp(double value) {
        this.value = value;
    }
    public double evaluate(double x) {
        return this.value;
    }

    public Expression derive() {
        return new ConstExp(0);
    }

    public String toString() {
        return Double.toString(this.value);
    }
}
