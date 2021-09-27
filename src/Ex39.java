public class Ex39 {
    private static void printStars(int amount) {

        int counter = 0;
        while (counter <= amount) {
            System.out.print("*");
            counter++;
        }

    }
    private static void separator() {
        System.out.print(System.lineSeparator());
    }

    public static void main(String[] args) {
        printStars(5);
        separator();
        printStars(9);
        separator();
        printStars(1);
    }
}
