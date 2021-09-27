import java.util.Random;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numberDrawn = drawNumber();
        int counter = 1;

        while(true) {
            System.out.println("Guess the number: ");
            int guess = Integer.parseInt(reader.nextLine());
            if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + counter);
                counter++;
            } else if (guess > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + counter);
                counter++;
            } else if (guess == numberDrawn) {
                System.out.println("Congratulations! Your guess is correct!");
                System.out.print("The number is " + numberDrawn + "!");
                break;
            }
        }


    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
