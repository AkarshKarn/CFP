package Day5PracticeProblems;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int num = sc.nextInt();
        System.out.println();

        if (num%2==0){
            System.out.println("The following number is a even number");
        }else {
            System.out.println("The following number is an odd number");
        }
    }
}
