package Day6PracticeProblems;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int t = 0;

        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                t = t + 1;
            }
        }

            if (t > 0) {
                System.out.println(num + " " + "is a not prime number");
            } else {
                System.out.println(num + " " + "is a prime number");
        }
    }
}
