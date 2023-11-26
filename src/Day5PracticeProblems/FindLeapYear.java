package Day5PracticeProblems;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {

        int year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year in at least four digit:");
        year=sc.nextInt();

        if (year<1000){
            System.out.println("Invalid input, please input year in four digit");
        }else {
            if (year%4==0){
                System.out.println("The following year will be a leap year");
            } else if (year%100==0 && year%400==0) {
                System.out.println("The following year will be a leap year");
            }else {
                System.out.println("The following year will not be a leap year");
            }
        }
    }
}
