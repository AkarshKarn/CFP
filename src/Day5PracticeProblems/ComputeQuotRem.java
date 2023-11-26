package Day5PracticeProblems;

import java.util.Scanner;

public class ComputeQuotRem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,quo=0,rem=0;
        System.out.println("Enter the dividend:");
        n1=sc.nextInt();
        System.out.println("Enter the divisor:");
        n2=sc.nextInt();

        quo=n1/n2;
        rem=n1%n2;

        System.out.println("Quotient is:"+" "+quo);
        System.out.println("Remainder is:"+" "+rem);
    }
}
