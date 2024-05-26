import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        // 4.Пользователь вводит пять слов, соберите из них целую строку, между каждым словом вставьте «, и»
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пять слов: ");
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 5; i++) {
            builder.append(scanner.nextLine() + ", и ");
        }

        System.out.println(builder);
    }
}
