public class Task_06 {
    public static void main(String[] args) {
        System.out.println("Задание №6");
        int totalNumbers = 100000;
        int excludedCount = 0;

        for (int i = 0; i < totalNumbers; i++) {
            String number = String.format("%05d", i);

            if (number.contains("4") || number.contains("13")) {
                excludedCount++;
            }
        }

        System.out.println("Количество номеров, которые нужно исключить: " + excludedCount);
    }
}
