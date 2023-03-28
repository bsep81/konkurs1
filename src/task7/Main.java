package task7;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

     //   System.out.println(fibonacci(45));
        System.out.println(fibonacci2(10));
        System.out.println(fibonacci2(100));
        System.out.println(fibonacci2(1000));

    }

    static BigInteger fibonacci(int n) {
        if (n == 1) {
            return new BigInteger("0");
        }
        if (n == 2) {
            return new BigInteger("1");
        }
        return fibonacci(n - 1).add(fibonacci(n - 2));
    }

    static BigInteger fibonacci2(int n) {

        if (n == 1) {
            return new BigInteger("0");
        }
        if (n == 2) {
            return new BigInteger("1");
        }

        int i = 3;
        BigInteger temp = new BigInteger("0");
        BigInteger tempMinus1 = new BigInteger("1");
        BigInteger tempMinus2 = new BigInteger("0");
        do {
            temp = tempMinus1.add(tempMinus2);
            tempMinus2 = tempMinus1;
            tempMinus1 = temp;
            i++;
        } while (i <= n);
        return temp;
    }
}
