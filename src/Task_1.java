import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        // 1.Пользователь вводит стихотворение из четырёх строк. Соберите их в одну переменную,
        // между каждой строкой вставьте символ переноса строки: «\n»
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стихотворение: ");

        StringBuilder builder = new StringBuilder();

        builder.append(scanner.nextLine() + "\n");
        builder.append(scanner.nextLine() + "\n");
        builder.append(scanner.nextLine() + "\n");
        builder.append(scanner.nextLine() + "\n");

        System.out.println(builder);
    }
}
