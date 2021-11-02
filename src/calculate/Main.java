package calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1;
        String s2;
        char symbol;
        char yORn;
        int a;
        int b;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            a = sc.nextInt();

            System.out.println("Enter second number");
            b = sc.nextInt();

            System.out.println("Please enter one of symbol +,-,*,/ : ");
            s1 = sc.next();

            symbol = s1.charAt(0);
            Calculator cl = new Calculator();
            cl.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter 'Y' or 'N'  : ");
            s2 = sc.next();
            yORn = s2.charAt(0);

        } while (yORn == 'Y');


    }
}
