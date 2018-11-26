public class DivExp extends BinaryExp {

    DivExp(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    @Override
    public Expression derive() {
        return new DivExp(new SubExp(new MulExp(exp1.derive(), exp2), new MulExp(exp1, exp2.derive())),
                new ExponentialExp(exp2, new ConstExp(2)));
    }

    @Override
    protected double doEvaluate(double val1, double val2) {
        return val1 / val2;
    }

    @Override
    protected String getOperator() {
        return "/";
    }
}
