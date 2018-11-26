public class InfixNotation implements Notation {
    public String arrage(String op, String operand1, String operand2) {
        return "(" + operand1 + op + operand2 + ")";
    }
}
