package javacoding;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n, an, d, a1;
        int choice;
        double result;

        System.out.println("1. Find the sum of n terms");
        System.out.println("2. Arithmetic Sequence formula");
        System.out.print("Enter your choice: ");
        choice = s.nextInt();

        if (choice == 1) {
            System.out.println("\n-- Find the Sum of n terms --");
            System.out.println("Choose method:");
            System.out.println("1. Using a_1 and a_n");
            System.out.println("2. Using a_1, n, and d");
            System.out.print("Enter your choice: ");
            int sumChoice = s.nextInt();

            if (sumChoice == 1) {
                System.out.print("Enter n: ");
                n = s.nextInt();
                System.out.print("Enter a_1: ");
                a1 = s.nextInt();
                System.out.print("Enter a_n: ");
                an = s.nextInt();

                result = (n / 2.0) * (a1 + an);
                System.out.println("The sum of the sequence is: " + result);

            } else if (sumChoice == 2) {
                System.out.print("Enter n: ");
                n = s.nextInt();
                System.out.print("Enter a_1: ");
                a1 = s.nextInt();
                System.out.print("Enter d: ");
                d = s.nextInt();

                result = (n / 2.0) * (2 * a1 + (n - 1) * d);
                System.out.println("The sum of the sequence is: " + result);

            } else {
                System.out.println("Invalid choice.");
            }

        } else if (choice == 2) {
            System.out.println("\n-- Arithmetic Sequence Formula --");
            System.out.println("1. Solve for n");
            System.out.println("2. Solve for a_n");
            System.out.println("3. Solve for d");
            System.out.println("4. Solve for a_1");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            if (choice == 1) {
                System.out.print("Enter a_n: ");
                an = s.nextInt();
                System.out.print("Enter a_1: ");
                a1 = s.nextInt();
                System.out.print("Enter d: ");
                d = s.nextInt();

                n = ((an - a1) / d) + 1;
                System.out.println("The value of n is: " + n);

            } else if (choice == 2) {
                System.out.print("Enter a_1: ");
                a1 = s.nextInt();
                System.out.print("Enter n: ");
                n = s.nextInt();
                System.out.print("Enter d: ");
                d = s.nextInt();

                an = a1 + (n - 1) * d;
                System.out.println("The value of a_n is: " + an);

            } else if (choice == 3) {
                System.out.print("Enter a_n: ");
                an = s.nextInt();
                System.out.print("Enter a_1: ");
                a1 = s.nextInt();
                System.out.print("Enter n: ");
                n = s.nextInt();

                d = (an - a1) / (n - 1);
                System.out.println("The value of d is: " + d);

            } else if (choice == 4) {
                System.out.print("Enter a_n: ");
                an = s.nextInt();
                System.out.print("Enter n: ");
                n = s.nextInt();
                System.out.print("Enter d: ");
                d = s.nextInt();

                a1 = an - (n - 1) * d;
                System.out.println("The value of a_1 is: " + a1);

            } else {
                System.out.println("Invalid choice.");
            }

        } else {
            System.out.println("Invalid choice.");
        }

        s.close();
    }
}
