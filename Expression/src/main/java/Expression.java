interface Expression {
    double evaluate(double x);
    Expression derive();
    String toString(Notation nt);
}
