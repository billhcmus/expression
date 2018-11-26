public class Main {
    public static void main(String[] args) {
        Expression exp1 = MonomialExp.createInstance(2,1);
        Expression exp2 = MonomialExp.createInstance(5,3);
        Expression exp3 = new AddExp(exp1, exp2);
        Expression exp4 = new MulExp(exp3, exp2);

        Notation nt = new InfixNotation();

        System.out.println(exp4.derive().toString(nt));
    }
}
