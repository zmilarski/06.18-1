package rationalnumber;

public class RationalNumber {
    // licznik
    private int numerator;
    // mianownik
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public RationalNumber getOpposite() {
        return new RationalNumber(-numerator, denominator);
    }

    public RationalNumber getInverse() {
        return new RationalNumber(denominator, numerator);
    }

    public RationalNumber multiply(RationalNumber x) {
        return new RationalNumber(numerator * x.numerator, denominator * x.denominator);
    }

    public RationalNumber divide(RationalNumber x) {
        return new RationalNumber(numerator / x.numerator, denominator / x.denominator);
    }

    public RationalNumber(int x) {
        this.numerator = x;
        this.denominator = 1;
    }

    public RationalNumber add(int x) {
        return new RationalNumber(numerator + x, denominator);
    }

    private static int euklides(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        int x = b;
        int r = a % b;
        int r1 = r;
        while (r != 0) {
            r = x % r;
            x = r1;
            r1 = r;

        }
        return x;
    }

    public RationalNumber reduce() {
        int y = euklides(numerator, denominator);
        return new RationalNumber(numerator / y, denominator / y);
    }

    public RationalNumber add(RationalNumber x) {
        int licz = numerator * x.denominator + x.numerator * denominator;
        int miano = denominator * x.denominator;

        return new RationalNumber(licz / euklides(licz, miano), miano / euklides(licz, miano));
    }

}
