import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int counter = 1;
        System.out.print("Up to what number?");
        int enterNumber = Integer.parseInt(reader.nextLine());

        while (counter <= enterNumber) {
            System.out.println(counter);
            counter++;
        }
    }
}