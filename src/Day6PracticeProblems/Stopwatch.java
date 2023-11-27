package Day6PracticeProblems;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double start,stop;
        double time;

        System.out.println("Enter any input to start the time:");
        int a=sc.nextInt();
        start=System.currentTimeMillis();

        System.out.println("Enter any input to stop the time:");
        int b=sc.nextInt();
        stop=System.currentTimeMillis();

        time=(stop-start);
        System.out.println("Elapsed time is:"+" "+time+" "+"msec");
    }
}
