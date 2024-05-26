import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        // 6.Пользователь вводит число, любое. 237, например. Выведите: 237 программистов, окончание должно
        // зависеть от числа. 1 программист, 2 программиста, и так далее

        StringBuilder programer = new StringBuilder("программист");

        System.out.print("Введите количество программистов: ");

        Scanner scanner = new Scanner(System.in);
        int intCount = scanner.nextInt();

        StringBuilder count = new StringBuilder(String.valueOf(intCount));

        if (count.length() > 2) {

            StringBuilder str = new StringBuilder(count.substring(count.length() - 2));

            getPostfix(programer, str);

        } else {
            getPostfix(programer, count);
        }

        System.out.println(count + " " + programer);
    }



    public static StringBuilder getPostfix(StringBuilder programer, StringBuilder str){

        if(str.length() > 1) {

            int x = Integer.valueOf(String.valueOf(str));

            if (x >= 5 && x < 21) {
                programer.append("ов");
            } else{
                getPostfixOne(programer, new StringBuilder(str.substring(1)));
            }

        } else {
            getPostfixOne(programer, str);
        }

        return programer;
    }

    public static StringBuilder getPostfixOne(StringBuilder programer, StringBuilder str) {
        int x = Integer.parseInt(str.toString());

        if (x == 1) {

        }
        if (x > 1 && x < 5) {
            programer.append("а");
        }
        if (x > 4 && x < 10) {
            programer.append("ов");
        }

        return programer;
    }
}
