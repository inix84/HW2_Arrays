import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Посчитать сумму выплат в компании:");
        int[] payments1 = new int[]{10000, 12000, 15000, 89000, 25000};
        int sum = 0; // инвариант суммы элементов массива
        for (int i = 0; i < payments1.length; i++) {
            sum += payments1[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println();
        System.out.println("Задача 2. Найти макс и мин в выплатах:");
        int[] payments2 = Arrays.copyOf(payments1, 5);
        int maxElement = -1; // заполнили невозможными данными
        int minElement = 1_000_000_000; // заполнили невозможными данными
        for (int i = 0; i < payments2.length; i++) {
            if (payments2[i] > maxElement) {
                maxElement = payments2[i];
            }
            if (payments2[i] < minElement) {
                minElement = payments2[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minElement + " рублей. ");
        System.out.println("Максимальная сумма трат за неделю составила " + maxElement + " рублей.");
        System.out.println();
        System.out.println("Задача 3. Найти СРЗНАЧ в выплатах:");
        int[] payments3 = Arrays.copyOf(payments1, 5);
        sum = 0; // инвариант суммы элементов массива
        for (int i = 0; i < payments3.length; i++) {
            sum += payments3[i];
        }
        float averageValue = (float) sum / payments3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей.");
        System.out.println();
        System.out.println("Задача 4. Перевернуть имена и фамилии:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}