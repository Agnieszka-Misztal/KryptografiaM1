import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {


        int k;
        BigInteger n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe n");
        n = scanner.nextBigInteger();
        System.out.println("Podaj liczbe bitow: ");
        k = scanner.nextInt();

        int bitLength = n.bitLength();
        while (k>bitLength){
            System.out.println("podana liczba przekracza liczbe bitow n, podaj liczbe bitow jeszcze raz: ");
            k = scanner.nextInt();
        }

        System.out.println("Wylosowana liczba: "+ nextRandomBigInteger(k + 1, n));


    }

    public static BigInteger nextRandomBigInteger(int kbit, BigInteger n) {
        Random rand = new Random();
        BigInteger result = new BigInteger(kbit, rand);
        int bitConunt = result.bitLength();

        while( (result.compareTo(n) == 1) || (result.compareTo(n)== 0) || !(bitConunt == (kbit-1)) ) {
            result = new BigInteger(kbit, rand);
            bitConunt =result.bitLength();
        }

        System.out.println("liczba bitow "+bitConunt);
        return result;
    }
}
