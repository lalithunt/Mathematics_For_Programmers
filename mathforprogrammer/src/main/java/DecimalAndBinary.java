import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class provides some example of what Decimal is and what Binary is.
 * How to create a Decimal and binary as well.
 *
 * INFO :
 * A Decimal has a base 10 while as Binary has base 2.
 * For example n10 is for decimal and n2 is for Binary.
 * To represent 125 in decimal you would say  5 x 1 + 2 x 10 + 1 x 100 = 125 i.e n / 10 and n % 10
 * To represent 125 in Binary you would say
 */
public class DecimalAndBinary {
    public static void main(String[] args) {
        System.out.println("Numbers are : "+findDigitsInDecimal(125));
        System.out.println("Binary Representation : "+findBinaryFromDecimal(125));

    }

    private static List<Integer> findDigitsInDecimal(int decimal) {
        List lst = new ArrayList<Integer>();
        if(decimal == 0) {
            lst.add(0);
            return lst;
        }
        while(decimal > 0) {
            int remainder = decimal % 10;
            lst.add(remainder);
            decimal = decimal / 10;
        }
        Collections.reverse(lst);
        return lst;
    }

    private static List<Integer> findBinaryFromDecimal(int decimal) {
        List lst = new ArrayList<Integer>();
        if(decimal == 0) {
            lst.add(0);
            return lst;
        }
        while(decimal > 0) {
            int remainder = decimal % 2;
            lst.add(remainder);
            decimal = decimal / 2;
        }
        Collections.reverse(lst);

        return lst;
    }
}
