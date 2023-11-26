package Day6PracticeProblems;

public class CouponProgram {
    char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
    int max=100000000;
    double random=(Math.random()*max);
    StringBuffer sb=new StringBuffer();

		while (double random>0)
    {
        sb.append(chars[random % chars.length]);
        random /= chars.length;
    }

    String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);
}
