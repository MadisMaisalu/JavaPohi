import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(read.nextLine());
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
