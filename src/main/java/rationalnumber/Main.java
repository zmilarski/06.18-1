package rationalnumber;

public class Main {
    public static void main(String[] args) {
        RationalNumber twoThirds = new RationalNumber(2, 3);
        System.out.println(twoThirds);
        RationalNumber fiveThirds = new RationalNumber(5, 3);

        RationalNumber oppos = twoThirds.getOpposite();
        System.out.println(oppos);

        RationalNumber inver = twoThirds.getInverse();
        System.out.println(inver);

        RationalNumber mnozona = twoThirds.multiply(fiveThirds);
        System.out.println(mnozona);

        RationalNumber dzielona = mnozona.divide(twoThirds);
        System.out.println(dzielona);
        RationalNumber calkow = new RationalNumber( 12);
        System.out.println(calkow);
        RationalNumber zDodanym = twoThirds.add(5);
        System.out.println(zDodanym);
        RationalNumber dwanascieOsmych = new RationalNumber(12,8);
        System.out.println(dwanascieOsmych);
        RationalNumber skrocona = dwanascieOsmych.reduce();
        System.out.println(skrocona);
    }

}
