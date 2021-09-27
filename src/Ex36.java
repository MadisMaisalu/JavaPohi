import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers:");
        while (true) {

            int enterNumber = Integer.parseInt(reader.nextLine());
            if (enterNumber == -1){
                System.out.println("Thank you and see you later!");
                break;
            }
        }
    }
}
