import java.util.ArrayList;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if(words.contains(word)) {
                System.out.println("You wrote " + word + " twice!");
                break;
            }
            words.add(word);

        }

    }
}
