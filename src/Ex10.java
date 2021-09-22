import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius of the circle:");
        double radius = Double.parseDouble(reader.nextLine());

        System.out.println(2*Math.PI*radius);
    }
}
