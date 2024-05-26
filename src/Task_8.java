import java.util.Objects;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        // 8.Вернитесь к программе, которая запрашивает курс валют. Напишите генератор даты для запроса к апи, на основе даты,
        // введенной пользователем. ИспользуйтеStringBuilder.
        Download pars = new Download();
        String[] delimetrMas = {"/", "-", ".", ",", " "};

        System.out.print("Введите дату в формате 'YYYY' 'MM' 'DD' либо 'dd' 'mm' 'yyyy' \n разделителем может быть ");
        for (String i : delimetrMas) {
            System.out.print("\"" + i + "\" ");
        }

        Scanner scanner = new Scanner(System.in);

        StringBuilder date = new StringBuilder(scanner.nextLine());

        StringBuilder result = new StringBuilder();

        // целевая дата dd/mm/yyyy
        // 23/05/2024
        // 2024/05/23

        for(String i : delimetrMas) {
            int x = 0;
            if((x = date.indexOf(i)) != -1) {

                if(x <= 2) {
                    result.append(delimetr(i, date));
                    break;
                } else {
                    result.append(revers(delimetr(i, date)));
                    break;
                }
            }
        }

        if(result.length() == 10) {
            System.out.println(parserPageCB(pars.downloadPage(urlToDate(result))));
        } else {
            System.out.println(" Неизвестный формат даты !!!");
        }
    }

    public static StringBuilder revers (StringBuilder date) {
        StringBuilder result = new StringBuilder();

        result.append(date.substring(8, 10));
        result.append(date.substring(4, 5));
        result.append(date.substring(5, 8));
        result.append(date.substring(0, 4));
    return result;
    }


    public static StringBuilder delimetr(String delimetr, StringBuilder date) {
        int x;
        if(!Objects.equals(delimetr, "/")) {
            while ((x = date.indexOf(delimetr)) != -1) {
                date.replace(x, x + 1, "/");
            }
        }
        return date;
    }

    public static String parserPageCB (StringBuilder page) {
        int valueStart = page.indexOf("<Value>") + 7;
        int valueEnd = page.indexOf("</Value>");
        String courseStr = page.substring(valueStart, valueEnd);
        String result = courseStr.replace(",", ".");

        return result;
    }

    public static StringBuilder urlToDate(StringBuilder date) {
        StringBuilder url = new StringBuilder();

        url.append("http://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=");
        url.append(date);
        url.append("&date_req2=");
        url.append(date);
        url.append("&VAL_NM_RQ=R01235");


        return url;
    }
}
