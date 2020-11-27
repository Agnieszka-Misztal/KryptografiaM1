import java.math.BigInteger;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        BigInteger n;
        BigInteger b;


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj n");
        n = scanner.nextBigInteger();
        System.out.println("podaj b");
        b = scanner.nextBigInteger();


        BigInteger u = odwrotnosc(b, n);




    }

    public static BigInteger odwrotnosc(BigInteger b, BigInteger n){
        BigInteger u = euclid(b,n);
        if(u.compareTo(BigInteger.ZERO) == (-1)){

            u = u.add(n);
        }
        System.out.println("element odwrotny: " + u);
        return u;

    }

    public static BigInteger euclid(BigInteger b, BigInteger n)
    {
        BigInteger u = BigInteger.ZERO, v = BigInteger.ONE, lastu = BigInteger.ONE, lastv = BigInteger.ZERO, temp;
        while (!(n.compareTo(BigInteger.ZERO) ==0))
        {
            BigInteger q = b.divide(n);
            BigInteger r = b.mod(n);


            b = n;
            n = r;

            temp = u;
            u = lastu.subtract(q.multiply(u));
            lastu = temp;

            temp = v;
            v = lastv.subtract(q.multiply(v));
            lastv = temp;
        }
        System.out.println("u "+ lastu + " v " + lastv);

        return lastu;
    }
}
