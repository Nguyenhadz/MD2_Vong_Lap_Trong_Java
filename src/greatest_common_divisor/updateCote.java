package greatest_common_divisor;
import java.util.Scanner;
public class updateCote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input random number 01:");
        int a = scanner.nextInt();
        System.out.println("Input random number 02:");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a ==0 || b==0) {
            System.out.println("Hai số "+a+ " và "+b+" không có ước chung lớn nhất.");
        } else {
            while (a!=b) {
                if (a>b) {
                    a = a-b;
                } else {
                    b = b-a;
                }
            }
            System.out.println("Ước chung lớn nhất là: "+a);
        }
    }
}
