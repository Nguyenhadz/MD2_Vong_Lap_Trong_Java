package drawing_shapes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Drawing the rectangle.");
        System.out.println("2. Drawing the triangle.");
        System.out.println("3. Drawing isosceles triangle.");
        System.out.println("0. Exit");
        System.out.println("Your choice:");
        int a = scanner.nextInt();
        switch (a) {
            case 1 -> {
                System.out.println("Input width:");
                int x = scanner.nextInt();
                System.out.println("Input height:");
                int y = scanner.nextInt();
                System.out.println("The rectangle:");
                for (int i = 0; i < y; i++) {
                    for ( int j = 0; j < x; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
            case 2 -> {
                System.out.println("Menu:");
                System.out.println("1. Top Left.");
                System.out.println("2. Top Right.");
                System.out.println("3. Bottom Left.");
                System.out.println("4. Bottom Right");
                System.out.println("Your choice:");
                int b = scanner.nextInt();
                switch (b) {
                    case 1 -> {
                        for (int i = 7; i > 0; i--) {
                            for (int j = 0; j < i; j++ ) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    case 2 -> {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                if (j >= i) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    case 3 -> {
                        for (int i = 0; i<7; i++) {
                            for (int j = 0; j <7; j++) {
                                if ( j<=i ) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    }
                    case 4 -> {
                        for (int i = 7; i>0; i--) {
                            for (int j = 0; j <7; j++) {
                                if (j>=i) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    }
                }
            }
            case 3 -> {
                System.out.println("Input height:");
                int number = scanner.nextInt();
                System.out.println("The isosceles triangle:");
                for (int i = 0; i < number; i++) {
                    for (int j = 0; j<= number+i; j++) {
                        if (j>=number-i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }

            }
        }
    }
}
