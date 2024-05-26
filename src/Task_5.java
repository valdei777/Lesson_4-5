import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        // 5.Пользователь вводит предложение их двух слов (считайте в одну переменную String phrase).
        // Вставьте между этими словами «так сказать» используя StringBuilder.insert. Было: «Учу Java».
        // Станет: «Учу, так сказать, Java»

        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два слова через пробел: ");
        String str = scanner.nextLine();

        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++) {

            if(i != words.length - 1) {
                result.append(words[i]);
                result.append(", так сказать, ");
            } else {
                result.append(words[i]);
            }
        }

        System.out.println(result);

    }
}
