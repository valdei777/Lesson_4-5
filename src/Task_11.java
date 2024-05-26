import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        // 11.Пусть пользователь вводит поля класса FileInformation, но в одну строку; формат придумайте сами.
        // Считайте ввод пользователя и из него создайте экземпляр класса.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через точку: имя файла. расширение фйла. размер файла в килобайтах. относительный путь к файлу" +
                "(если он находится в дирректории с программой то ничего воодить не нужно)");

        StringBuilder build = new StringBuilder(scanner.nextLine());

        FileInformation fileInformation = new FileInformation();

        fileInformation.setName(build.substring(0, build.indexOf(".")));
        build.replace(0, build.indexOf(".") + 1, "");
        fileInformation.setPostfix(build.substring(0, build.indexOf(".")));
        build.replace(0, build.indexOf(".") + 1, "");
        fileInformation.setSize(Long.parseLong(build.substring(0, build.indexOf("."))));
        build.replace(0, build.indexOf(".") + 1, "");
        fileInformation.setPath(build.substring(0));



        // test.txt.1.files/
    }

    public static class FileInformation {
        private String name;

        private String postfix;

        private long  size;

        private String path;

        public FileInformation() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPostfix() {
            return postfix;
        }

        public void setPostfix(String postfix) {
            this.postfix = postfix;
        }

        public long getSize() {
            return size;
        }

        public void setSize(long size) {
            this.size = size;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }

}

