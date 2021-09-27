import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        System.out.println("Type a number, if you enter 0, then program will be stopped. ");

        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }

            sum = read + sum;
            System.out.println("Sum now: " + sum + ", type a new number. Type 0 for stop.");
        }

        System.out.println("Sum in the end: " + sum);
    }
}
