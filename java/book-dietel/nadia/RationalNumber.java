
public class RationalNumber {

    private static int numerator;
    private static int denominator;

    public RationalNumber(){
        numerator = 0;
        denominator =1;
    }

    public RationalNumber(int numerator, int denominator) {
        if (numerator == 0) {
            numerator = 0;
            denominator = 1;
        } else {
            int a = Math.abs(numerator);
            int b = Math.abs(denominator);
            int g = gcd(a, b);
            numerator = numerator / g;
            denominator = denominator / g;
            System.out.println(numerator + "/" + denominator);
        }
    }

    public static void addRationalNumber(int a,int b,int c,int d){
          int  num = Math.abs( a + c);
          int denom =Math.abs( b + d);
          int g = gcd(num,denom);
          numerator = num /g;
          denominator = denom /g;
        System.out.println("Sum of the Fraction " + a + "/" +  b + " + " + c + "/" + d + " = " + numerator + "/" + denominator);
    }

    public static void subRationalNumber(int a,int b,int c,int d){
        int  num = Math.abs( a - c);
        int denom =Math.abs( b - d);
        int g = gcd(num,denom);
        numerator = num /g;
        denominator = denom /g;
        System.out.println("Subtraction of the Fraction " + a + "/" +  b + " - " + c + "/" + d + " = " + numerator + "/" + denominator);
    }

    public static void mullRationalNumber(int a,int b,int c,int d){
        int  num = Math.abs( a * c);
        int denom =Math.abs( b * d);
        int g = gcd(num,denom);
        numerator = num /g;
        denominator = denom /g;
        System.out.println("Mulltiplication of the Fraction " + a + "/" +  b + " * " + c + "/" + d + " = " +numerator + "/" + denominator);
    }

    public static void divRationalNumber(int a,int b,int c,int d){
        int  num = Math.abs( a * d);
        int denom =Math.abs( b * c);
        int g = gcd(num,denom);
        numerator = num /g;
        denominator = denom /g;
        System.out.println("Division of the Fraction " + a + "/" +  b + " / " + c + "/" + d + " = " +numerator + "/" + denominator);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}

