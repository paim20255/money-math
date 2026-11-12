import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        float f = 0;
        double d = 0.1;
        BigDecimal bigDecimal = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {
            System.out.println(bigDecimal);


        }
        double doublePointThree = 0.1 + 0.2;
           // System.out.println(doublePointThree);

        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");

        BigDecimal bigDecimalPointThree = a.add(b);

        //System.out.println(bigDecimalPointThree);

        System.out.println("are they equal?: " + bigDecimalPointThree.equals(doublePointThree));


    }
}
