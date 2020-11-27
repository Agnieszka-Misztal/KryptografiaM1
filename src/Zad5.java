import java.math.BigInteger;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {

        BigInteger b;
        BigInteger p;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe p , gdzie p= 3(mod 4) jest liczba pierwsza :");
        p = scanner.nextBigInteger();
        System.out.println("Podaj b ktora jest reszta kwadratowa Zp: ");
         b = scanner.nextBigInteger();

        System.out.println("Pierwiastek : " + Euler(b, p));


    }

    public static BigInteger Euler(BigInteger a, BigInteger p) {


            BigInteger k = (p.add(BigInteger.ONE)).divide(new BigInteger("4"));

            BigInteger test = modExp(a,k,p);

            return test;

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
