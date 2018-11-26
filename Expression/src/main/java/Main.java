public class Main {
    public static void main(String[] args) {
        Expression exp1 = MonomialExp.createInstance(2,1);
        Expression exp2 = MonomialExp.createInstance(5,3);
        Expression n = new ConstExp(3);
        Expression exp3 = new AddExp(exp1, exp2);
        Expression exp4 = new MulExp(exp3, exp2);
        Expression exp5 = new ExponentialExp(exp3, n);
        Expression exp6 = new DivExp(exp1, exp2);
        Notation nt = new InfixNotation();
        System.out.println(exp6.toString(nt));
        double rs = exp6.evaluate(2);
        System.out.println(rs);
    }
}
