import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        // 2.Пользователь вводит три слова, соберите из них строку, где слова будут в обратном порядке

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три слова");
        StringBuilder str = new StringBuilder();
        str.insert(0, scanner.nextLine() + " ");
        str.insert(0, scanner.nextLine() + " ");
        str.insert(0, scanner.nextLine() + " ");

        System.out.println(str);
    }
}
