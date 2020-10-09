import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class java_BigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bi1 = new BigInteger(scanner.next());
        BigInteger bi2 = new BigInteger(scanner.next());

        BigInteger  bi3, bi4;
        bi3 = bi1.add(bi2);
        bi4 = bi1.multiply(bi2);
        System.out.println( bi3);
        System.out.println( bi4);

        ArrayList<Integer> list = new ArrayList<Integer>();
    }
}
