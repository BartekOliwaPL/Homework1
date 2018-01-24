import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;
        int result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą zmienną: ");
        a = scanner.nextInt();
        System.out.println("Podaj drugą zmienną: ");
        b = scanner.nextInt();

        /*System.out.println(a*b);
    }

    public static int multiply(int a, int b) {
        return a*b;
   */

        for (int i = 0; i < b; i++) {
            result += a;
        }
        System.out.println(result);
    }
}