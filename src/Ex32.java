import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        System.out.print("Until what number? ");
        int number = Integer.parseInt(reader.nextLine());


        while (counter <= number) {
            sum = counter + sum;
            counter++;
        }
        System.out.println(sum);
    }
}
