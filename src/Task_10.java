import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        // 10.Напишите крестики-нолики, используя StringBuilder
        StringBuilder pole = new StringBuilder("*1*2*3\n*4*5*6\n*7*8*9");
        System.out.println("Чтобы сделать ход укажите порядковый номер ячейки и свой литерал 'x' или '0'");
        System.out.println(pole);

        Scanner scanner = new Scanner(System.in);

        while(pole.indexOf("*") != -1) {
            StringBuilder temp = new StringBuilder(scanner.nextLine());
            int index = Integer.parseInt(temp.substring(0, 1));
            String literal = temp.substring(1, 2);

            if(index < 4) {
                if (index == 1) {
                    pole.setCharAt(index - 1, literal.charAt(0));
                } else {
                    pole.setCharAt((index * 2) - 2, literal.charAt(0));
                }
            } else if(index < 7) {
                pole.setCharAt((index * 2) - 1, literal.charAt(0));
            } else if (index < 10) {
                pole.setCharAt(index * 2, literal.charAt(0));
            }

            System.out.println(pole);
        }

    }
}
