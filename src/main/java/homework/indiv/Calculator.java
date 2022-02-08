package homework.indiv;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        char operation;


        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первое число: ");
        num1 = scanner.nextInt();
        System.out.println("Второе число: ");
        num2 = scanner.nextInt();

        System.out.print("\nВведите один из операторов: (+, -, *, /): ");
        operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.print("Ошибка! Введите корректный оператор!");
                return;
        }
        System.out.print("\nРезультат операции: \n");
        System.out.print(num1 + " " + operation + " " + num2 + " = " + result);
    }
}
