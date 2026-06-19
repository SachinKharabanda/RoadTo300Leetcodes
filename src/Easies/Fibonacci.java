package Easies;

public class Fibonacci {

    public int fib(int n) {

        //using recursion implementation

        if (n==0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else if (n > 1) {
            return fib(n-1) + fib(n-2);
        }

        return 0;

    }

}
