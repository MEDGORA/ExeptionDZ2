import java.util.Scanner;

public class task4 {
        public static void push(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String str1 = "";
        if (str.equals(str1)){
            str = null;
            try {
                str.equals(str1);
            } catch (NullPointerException e) {
                System.out.println("пустые строки вводить нельзя");
            }
        } else {
            System.out.println("Ваша строка: " + str);
        }
        in.close();
    }

    public static void main(String[] args) {
        push();
    }
}
