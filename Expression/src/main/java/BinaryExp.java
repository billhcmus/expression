public abstract class BinaryExp implements Expression {

    protected Expression exp1;
    protected Expression exp2;

    BinaryExp(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public double evaluate(double x) {
        double val1 = exp1.evaluate(x);
        double val2 = exp2.evaluate(x);
        return doEvaluate(val1, val2);
    }

    public String toString(Notation nt) {
        return nt.arrage(getOperator(), exp1.toString(nt), exp2.toString(nt));
    }

    public abstract Expression derive();

    protected abstract double doEvaluate(double val1, double val2);

    protected abstract String getOperator();

}
