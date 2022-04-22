package homework.indiv;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalculatorOperationHandler {

    CalculatorOperations calculatorOperations;


    public int calculation(int num1, int num2) {
        return calculatorOperations.calculation(num1, num2);
    }
}
