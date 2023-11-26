package Day5PracticeProblems;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number till you want the series:");
        int num = sc.nextInt();
        double series = 0.0;

        System.out.println("Harmonic series is:");
        for (int i=num;i>0;i--){
            series=series+(double)1/i;
            System.out.print(series+",");
        }
    }
}

