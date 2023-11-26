package Day5PracticeProblem;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {


        int num1, num2, temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1=sc.nextInt();
        System.out.println("Enter the second number:");
        num2=sc.nextInt();

        System.out.println("Before swapping:"+num1+" "+num2);

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After swapping:"+" "+num1+" "+num2);

    }
}
