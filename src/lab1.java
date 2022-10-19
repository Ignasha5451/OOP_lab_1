import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc_N = new Scanner(System.in);
        System.out.print("Input N: ");
        int N;
        if (sc_N.hasNextInt()) {
            N = sc_N.nextInt();
        }
        else {
            System.out.println("Error: wrong input");
            return;
        }
        int C2 = N % 2;
        int C3 = N % 3;
        int C5 = N % 5;
        int C7 = N % 7;
        System.out.println("C2 = " + C2);
        System.out.println("C3 = " + C3);
        System.out.println("C5 = " + C5);
        System.out.println("C7 = " + C7);
        int C = C3;

        Scanner sc_a = new Scanner(System.in);
        System.out.print("Input a: ");
        short a = sc_a.nextShort();

        Scanner sc_b = new Scanner(System.in);
        System.out.print("Input b: ");
        short b = sc_b.nextShort();

        Scanner sc_n = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc_n.nextInt();

        Scanner sc_m = new Scanner(System.in);
        System.out.print("Input m: ");
        int m = sc_m.nextInt();

        double num, den, result = 0;

        if (a <= n && b <= m) {
            if (a <= -C && -C <= n) {
                System.out.println("Error: denominator cannot be zero");
            }
            else {
                for (short i = a; i <= n; i++) {
                    den = i + C;
                    for (short j = b; j <= m; j++) {
                        num = i - j;
                        result += num / den;
                    }
                }
                System.out.println("Result is: " + result);
            }
        }
        else {
            System.out.println("Result is: 0");
        }
    }
}
