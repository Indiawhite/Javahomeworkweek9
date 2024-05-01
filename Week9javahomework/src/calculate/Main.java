package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

            System.out.print("Enter first Number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second Number: ");
            int num2 = scanner.nextInt();

            System.out.print("Please enter one of symbol +,-,*, /: ");
            char symbol = scanner.next().charAt(0);

            calculator.calculateResult(num1, num2, symbol);

        }
    }
