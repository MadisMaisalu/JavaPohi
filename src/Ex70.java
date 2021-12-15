import java.util.ArrayList;

public class Ex70 {
    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        // Making a method to use combine to use first array argument and
        // second to make one list
        first.addAll(second);
    }

    public static void main(String[] args) {
        // Declaring integer lists
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // Adding values into both arrays
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        combine(list1, list2);
        System.out.println(list1);
    }
}
