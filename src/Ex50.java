import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        if(name.length() <= 2) {
            System.out.println("Name is too short");
        } else {

            System.out.println(name.charAt(0));
            System.out.println(name.charAt(1));
            System.out.println(name.charAt(2));
        }

    }
}
