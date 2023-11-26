package Day5PracticeProblems;

import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your alphabet:");

        char alp=sc.next().charAt(0);
        System.out.println();

        if (alp=='a' || alp=='e' ||  alp=='i' || alp=='o' || alp=='u'){
            System.out.println("The following alphabet is a vowel");
        }else {
            System.out.println("The following alphabet is a consonant");
        }
    }
}
