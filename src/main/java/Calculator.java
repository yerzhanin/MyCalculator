import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("First number: ");
            double firstNumber = scanner.nextInt();
            System.out.print("Second number: ");
            double secondNumber = scanner.nextInt();
            System.out.println("Operation (+-*/)");
            String operation = scanner.next();

            switch (operation) {
                case "*":
                    System.out.println("Result: " + (firstNumber * secondNumber));
                    break;
                case "/":
                    System.out.println("Your Result: " + (firstNumber / secondNumber));
                    break;
                case "+":
                    System.out.println("Your Result: " + (firstNumber + secondNumber));
                    break;
                case "-":
                    System.out.println("Your Result: " + (firstNumber - secondNumber));
                    break;
                default:
                    System.out.println("Please select a valid character");
            }
            scanner.close();
        }
    }
