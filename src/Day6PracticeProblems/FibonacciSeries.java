package Day6PracticeProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Nth term till you want the series:");
        int num = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;

        System.out.println("Fibonacci Series:");

        if (num<0) {
            System.out.println("Invalid input");
        }

        else{
            for (int i = 0; i < num; i++) {
                a = b;
                b = c;
                c = a + b;

                System.out.println(a + " ");
            }
        }
    }
}
