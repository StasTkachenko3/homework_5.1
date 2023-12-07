import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Задание №3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String predlozheniye = scanner.nextLine();

        String[] slova = predlozheniye.split(" ");
        int Obshchayadlina = 0;

        for (String word : slova) {
            Obshchayadlina += word.length();
        }

        double Srednyayadlina = (double) Obshchayadlina / slova.length;

        System.out.println("Средняя длина слова: " + Srednyayadlina);
    }
}

