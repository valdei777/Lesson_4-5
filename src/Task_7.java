import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        // 7.Пользователь вводит предложение, удалите все пробелы из него.

        System.out.println("Введите предложение: ");
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder(scanner.nextLine());

        int x;
        while((x = builder.indexOf(" ")) != -1) {
            builder.replace(x, x+1, "");
        }
        System.out.println(builder);
    }
}


// H e l l o W  orld !
