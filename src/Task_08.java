import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        System.out.println("Задание №8");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите идентификатор переменной: ");
        String input = scanner.nextLine();

        String output = convertIdentifier(input);
        System.out.println("Результат: " + output);
    }

    public static String convertIdentifier(String input) {
        if (isJavaIdentifier(input)) {
            return convertToCppIdentifier(input);
        } else if (isCppIdentifier(input)) {
            return convertToJavaIdentifier(input);
        } else {
            return "Некорректный идентификатор";
        }
    }

    public static boolean isJavaIdentifier(String input) {
        return input.matches("[a-z][a-zA-Z0-9]*");
    }

    public static boolean isCppIdentifier(String input) {
        return input.matches("[a-z_][a-z0-9_]*");
    }

    public static String convertToCppIdentifier(String input) {
        StringBuilder output = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                output.append("_");
                output.append(Character.toLowerCase(c));
                capitalizeNext = false;
            } else if (c == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    output.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    output.append(c);
                }
            }
        }

        return output.toString();
    }

    public static String convertToJavaIdentifier(String input) {
        StringBuilder output = new StringBuilder();
        boolean capitalizeNext = false;

        for (char c : input.toCharArray()) {
            if (c == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    output.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    output.append(c);
                }
            }
        }

        return output.toString();
    }
}