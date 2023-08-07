package prime_first_20;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for ( int i = 2; ; i++) {
            boolean flag = true;
            for ( int j = 2; j <= Math.sqrt(i); j++){
                if (i%j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
            if (count == 20) {
                break;
            }
        }
    }
}
