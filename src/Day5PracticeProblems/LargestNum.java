package Day5PracticeProblems;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        num1=sc.nextInt();

        System.out.println("Enter the second number:");
        num2=sc.nextInt();

        System.out.println("Enter the third number:");
        num3=sc.nextInt();

        int[] arr={num1,num2,num3};
        int max=arr[0];

        for (int i=0;i< arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.println(max);


    }
}
