import java.math.BigInteger;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        BigInteger b;
        BigInteger p;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe b: ");
        b = scanner.nextBigInteger();
        System.out.println("Podaj liczbe p, niech p > 2 bedzie liczba pierwsza");
        p = scanner.nextBigInteger();

        System.out.println(check(b, p));

    }



    public static boolean check(BigInteger a,BigInteger p)

    {
        if (!a.equals(BigInteger.ZERO))
        {


            BigInteger k = (p.subtract(BigInteger.ONE)).divide(BigInteger.TWO);
            BigInteger test = modExp(a,k, p);






            if (test.equals(BigInteger.ONE)) {

                return true;

            }

        }

        return false;

    }
    public static BigInteger modExp(BigInteger a, BigInteger k, BigInteger n){
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
