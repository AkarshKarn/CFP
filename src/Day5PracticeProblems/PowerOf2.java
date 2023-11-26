package Day5PracticeProblems;

public class PowerOf2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int power = 1;

        if (num > 31) {
            System.out.println("value of number should be less than 31");
            return;
        }


        else {
            System.out.println(power);
            for (int i = 1; i <= num; i++) {
                power = power * 2;
                System.out.println(power);
            }
        }
    }
}