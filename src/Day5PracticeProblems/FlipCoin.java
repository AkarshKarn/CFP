package Day5PracticeProblems;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of times you want flip the coin");
        int num = sc.nextInt();

        float percentHeads , percentTails;
        float heads = 0.0f, tails = 0.0f;

        Random ran = new Random();
        float flip;

        System.out.println();


        if (num < 0) {
            System.out.println("Invalid input,please input a positive number");
        } else {
            for (int i = 0; i < num; i++) {
                flip = ran.nextFloat() + 0;
                if (flip < 0.5) {

                    heads++;
                } else if (flip > 0.5 && flip < 1) {

                    tails++;
                } else {
                    System.out.println("Invalid");
                }


            }
            percentHeads = (heads / num) * 100;
            percentTails = (tails / num) * 100;

            System.out.println();

            System.out.println("Percentage of heads is:" + " " + percentHeads);
            System.out.println();
            System.out.println("Percentage of tails is:" + " " + percentTails);


        }
    }
}
