import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0) {
                System.out.print("This is a leap year!");

            } else if (year % 100 != 0) {
                System.out.print("This is not a leap year");

            } else if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("This is not a leap year!");

            }
        } else {
            System.out.print("This is not a leap year!");

        }
    }
}
