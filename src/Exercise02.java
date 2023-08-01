import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Привет, " + name + "!");
    }
}
