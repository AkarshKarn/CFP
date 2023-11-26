package Day6PracticeProblems;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponProgram {

    public static void generateCoupon(){
        Random ran = new Random();

        Scanner sc= new Scanner(System.in);
        Set<Integer> set = new LinkedHashSet<>();

        System.out.println("Enter the total number of random digits of the coupon:");
        int size=sc.nextInt();

        for (int i=0;i<size;i++){
            set.add(ran.nextInt(1000)+1);

        }
        System.out.print("Random Coupon Number:"+" "+set+",");

    }


    public static void main(String[] args) {
        generateCoupon();
    }
}



