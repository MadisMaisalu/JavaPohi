import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        double number = Double.parseDouble(reader.nextLine());

        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is not positive");
        }
    }
}
