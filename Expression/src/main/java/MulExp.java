public class MulExp extends BinaryExp {

    MulExp(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    public Expression derive() {
        return new AddExp(new MulExp(exp1.derive(), exp2), new MulExp(exp1, exp2.derive()));
    }

    protected double doEvaluate(double val1, double val2) {
        return val1 * val2;
    }

    protected String getOperator() {
        return "*";
    }
}
