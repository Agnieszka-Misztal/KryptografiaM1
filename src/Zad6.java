import java.math.BigInteger;
import java.util.Scanner;

public class Zad6 {

    public static void main(String[] args) {

        BigInteger a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe do sprawdzenia: ");
        a = scanner.nextBigInteger();

        System.out.println(isPrime(a));

    }

    public static boolean isPrime(BigInteger number) {

        return number.isProbablePrime(100);
    }
}
