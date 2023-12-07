import java.util.ArrayList;
import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку текста: ");
        String text = scanner.nextLine();

        System.out.print("Введите символ: ");
        char symbol = scanner.nextLine().charAt(0);

        ArrayList<Integer> indices = new ArrayList<Integer>();
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                indices.add(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Совпадений не найдено." + " Соответствующий текст: " + text);
        } else {
            System.out.println("Индексы совпадений: " + indices);
            System.out.println("Количество совпадений: " + count);
        }
    }
}




