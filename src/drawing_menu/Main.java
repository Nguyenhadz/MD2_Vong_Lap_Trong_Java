package drawing_menu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Drawing the triangle.");
        System.out.println("2. Drawing the rectangle.");
        System.out.println("3. Drawing the square.");
        System.out.println("0. Exit");
        System.out.println("Your choice:");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Drawing the triangle:");
                System.out.println("* * * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * *");
                System.out.println("* * *");
                System.out.println("* *");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Drawing the rectangle:");
                System.out.println("* * * * * * * * * * *");
                System.out.println("* * * * * * * * * * *");
                System.out.println("* * * * * * * * * * *");
                System.out.println("* * * * * * * * * * *");
                break;
            case 3:
                System.out.println("Drawing the square:");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * #");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice.");
        }
    }
}
