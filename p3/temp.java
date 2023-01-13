import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input = new Scanner(System.in);

        try {
            x = input.nextInt();
            y = input.nextInt();
            System.out.println(x + "/" + y + "=" + x/y);
        } catch (InputMismatchException e) {
            System.out.println(e);
            input.nextLine();
        }


        try {
            String text = input.nextLine();
            y = input.nextInt();
            System.out.println(text + y);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
