package Easies;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {

        //using change of base and then checking if the answer is an int

        double a = Math.log10(n);
        double b = Math.log10(2);

        return a / b % 1 == 0;

    }

}
