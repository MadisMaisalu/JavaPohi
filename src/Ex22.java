import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the password: ");
        String command = reader.nextLine();

        if (command.equals("qwerty")) {
            System.out.println("Correct password!");
        } else {
            System.out.println("Incorrect password!");
        }
    }
}
