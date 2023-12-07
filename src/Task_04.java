import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        System.out.println("Задание №4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            if (startsWithVowel(word) && endsWithConsonant(word)) {
                System.out.println(word);
            }
        }
    }

    public static boolean startsWithVowel(String word) {
        char firstChar = Character.toLowerCase(word.charAt(0));
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
    }

    public static boolean endsWithConsonant(String word) {
        char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));
        return !(lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u');
    }
}



