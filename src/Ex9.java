import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number:");
        double number1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type an another number:");
        double number2 = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + number1/number2);
    }
}
