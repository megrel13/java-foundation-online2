package homework.indiv;

public class DivisionCalc implements CalculatorOperations {

    @Override
    public int calculation(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException arithmeticException) {
            throw new CalculatorException("Деление на ноль");
        }
    }
}
