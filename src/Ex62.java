import java.util.ArrayList;
import java.util.Collections;

public class Ex62 {

    public static void removeLast(ArrayList<String> list) {
        int counter = 0;

    }
    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        Collections.sort(brothers);
        int last = brothers.size() + 1;
        removeLast(brothers);
        System.out.println("brothers:");
        System.out.println(brothers);

    } ////////////////?


}
