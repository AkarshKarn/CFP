package Day6PracticeProblems;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long start,stop;
        double time;

        System.out.println("Enter any input to start the time:");
        char str=sc.next().charAt(0);
        start=System.currentTimeMillis();

        System.out.println("Enter any input to stop the time:");
        char stp=sc.next().charAt(0);
        stop=System.currentTimeMillis();

        time=(stop-start);
        System.out.println("Elapsed time is:"+" "+time+" "+"msec");
    }
}
