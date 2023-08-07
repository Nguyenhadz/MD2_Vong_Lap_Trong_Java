package greatest_common_divisor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input random number 01:");
        int a = scanner.nextInt();
        System.out.println("Input random number 02:");
        int b = scanner.nextInt();
        for ( int i = a - 1; i>0; i--) {
            if (a%i == 0) {
                if (b%i == 0) {
                    System.out.println("The greatest common divisor of "+a+" and "+b+" is: "+i);
                    break;
                }
            }
        }
    }
}
