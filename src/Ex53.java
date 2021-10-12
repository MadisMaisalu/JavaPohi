import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word: ");
        String name = reader.nextLine();

        System.out.println("Length of first part: ");
        int length = Integer.parseInt(reader.nextLine());

        System.out.println(name.substring(0, length));

    }
}
