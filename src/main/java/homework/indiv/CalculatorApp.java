package homework.indiv;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        int operation;
        int result;

        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первое число: ");
        int num1 = scanner.nextInt();
        System.out.println("Второе число: ");
        int num2 = scanner.nextInt();


        System.out.print("\nВведите один из операторов: (+, -, *, /): ");
        operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                CalculatorOperationHandler handler1 = new CalculatorOperationHandler(new AdditionCalc());
                result = handler1.calculation(num1, num2);
                break;
            case '-':
                CalculatorOperationHandler handler2 = new CalculatorOperationHandler(new DifferenceCalc());
                result = handler2.calculation(num1, num2);
                break;
            case '*':
                CalculatorOperationHandler handler3 = new CalculatorOperationHandler(new MultiplicationCalc());
                result = handler3.calculation(num1, num2);
                break;
            case '/':
                CalculatorOperationHandler handler4 = new CalculatorOperationHandler(new DivisionCalc());
                result = handler4.calculation(num1, num2);
                break;
            default:
                System.out.print("Ошибка! Введите корректный оператор!");
                return;
        }
        System.out.print("\nРезультат операции: \n");
        System.out.print(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
