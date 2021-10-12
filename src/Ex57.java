import java.util.ArrayList;
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        int counter1 = 1;
        while (counter1 < 5) {
            System.out.println("Type a word: ");
            words.add(reader.nextLine());
            counter1++;
        }

        int place = 0;
        while (place < words.size()) {
            System.out.println(words.get(place));
            place++;
        }
    }


}
