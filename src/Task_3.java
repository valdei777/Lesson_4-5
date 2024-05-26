import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        // 3.Пользователь вводит слово. Добавьте к нему в начало «вы говорите:» ... слово пользователя. И в конец: «.. и что?»

        System.out.println("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(scanner.nextLine());

        builder.insert(0, "Вы говорите: ");
        builder.append(".. и что?");

        System.out.println(builder);
    }
}
