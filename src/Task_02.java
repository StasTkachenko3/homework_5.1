import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println("Задание №2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        StringBuilder numberString = new StringBuilder();
        int i = 1;

        while (numberString.length() < n) {
            numberString.append(i);
            i++;
        }

        System.out.println("Строка чисел: " + numberString.toString());

        if (n <= numberString.length()) {
            char digit = numberString.charAt(n - 1);
            System.out.println("Цифра на позиции " + n + ": " + digit);
        } else {
            System.out.println("Позиция " + n + " выходит за пределы строки чисел.");
        }
    }
}



