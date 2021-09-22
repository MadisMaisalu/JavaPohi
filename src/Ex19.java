import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?: ");
        int age = Integer.parseInt(reader.nextLine());

        if (age < 0) {
            System.out.println("Impossible!");
        } else if (age >= 150) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
