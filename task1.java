import java.util.Scanner;

public class task1 {

    public static void push(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число с запятой: ");
        float num = in.nextFloat();
          
        System.out.println("Ваше число: " + num);
        in.close();
    }

    public static void main(String[] args) {
        try{
        push();
        } catch (Exception e) {
            System.out.println("Данные введены некоректно! Попроуйте снова");
            push();
        }
    }
}