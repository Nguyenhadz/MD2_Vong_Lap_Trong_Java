package check_integer;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input random number:");
        int number = scanner.nextInt();
        if (number<2) {
            System.out.println(number + " Not a integer number.");
        } else {
            int i = 2;
            boolean flag = true;
            while (i<Math.sqrt(number)) {
                if (number%i==0) {
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag) {
                System.out.println(number + " is a integer number.");
            } else {
                System.out.println(number + " is NOT a integer number.");
            }
        }
    }
}
