import java.util. Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение:");
        String input = scanner.nextLine();
        String result;
            result = calc (input);
            System.out.println("Результат: " + result);
            }
    public static String calc (String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Неправильный формат выражения");
        }
            int num1 = Integer.parseInt(parts[0]);
            int num2 = Integer.parseInt(parts[2]);
            String operator = parts[1];
            int result;
            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10){
                throw new IllegalArgumentException("Числа должны быть от 1 до 10 включительно");
            }
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new IllegalArgumentException("Деление на ноль недопустимо");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Heпpавильный оператор");
            }
            return String.valueOf(result);
        }
    }