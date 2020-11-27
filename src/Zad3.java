import java.math.BigInteger;
import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {

        BigInteger a;
        BigInteger k;
        BigInteger n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj podstawę potegi a: ");
        a = scanner.nextBigInteger();
        System.out.println("Podaj wykładnik potegi k: ");
        k = scanner.nextBigInteger();
        System.out.println("Podaj liczbe n (mod n): ");
        n = scanner.nextBigInteger();

        System.out.println(binaryPow(a, k, n));


    }

    public static BigInteger binaryPow(BigInteger a, BigInteger k, BigInteger n){
        BigInteger y = BigInteger.ONE;
        while (k.compareTo(BigInteger.ZERO)>0){


            if(k.testBit(0)){
                y = (y.multiply(a)).mod(n);
            }
            k=k.shiftRight(1);
            a = (a.multiply(a)).mod(n);

        }


        return y;
    }
}
