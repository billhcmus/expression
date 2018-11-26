public class ExponentialExp extends BinaryExp {
    ExponentialExp(Expression exp, Expression n) {
        super(exp, n);
    }

    @Override
    public Expression derive() {
        return new MulExp(new MulExp(exp2, new ExponentialExp(exp1,
                new SubExp(exp2, new ConstExp(1)))), exp1.derive());
    }

    @Override
    protected double doEvaluate(double val1, double val2) {
        return Math.pow(val1, val2);
    }

    @Override
    protected String getOperator() {
        return "^";
    }
}
