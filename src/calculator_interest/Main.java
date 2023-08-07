package calculator_interest;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double money;
        int month;
        double interestMonth;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount money:");
        money = scanner.nextDouble();
        System.out.println("Input amount month:");
        month = scanner.nextInt();
        System.out.println("Input interest month: ");
        interestMonth = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i<month; i++) {
            totalInterest += money*(interestMonth/100)/12*month;
        }
        System.out.println("Total interest: " + totalInterest);
    }
}
