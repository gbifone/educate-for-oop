public class Rational {
    private static int num;
    private int denom;

    public Rational ( ) {
        num = 0;
        denom = 1;
    }

    public Rational ( int num, int denom ) {
        if (num == 0) {
            this.num = 0;
            this.denom = 1;
        } else {
            int n = Math.abs(num);
            int d = Math.abs(denom);
            int g = gcd(n, d);
            this.num = num / g;
            this.denom = denom / g;
            System.out.println("Fraction of 2/4: " + this.num + "/" + this.denom);
        }
    }
    public static int gcd(int n, int d) {
        while (d != 0) {
            int t = d;
            d = n % d;
            n = t;
        }
        return n;
    }
    public static void addRational(int a,int b,int c,int d){
        int  num = Math.abs( a + c);
        int denom =Math.abs( b + d);
        int g = gcd(num,denom);
        num = num /g;
        denom = denom /g;
        System.out.println("Sum of Fraction: " + a + "/" +  b + " + " + c + "/" + d + " = " + num + "/" + denom);
    }
    public static void subtractRational(int a,int b,int c,int d){
        int  num = Math.abs( a - c);
        int denom =Math.abs( b - d);
        int g = gcd(num,denom);
        num = num /g;
        denom = denom /g;
        System.out.println("Subtraction of Fraction: " + a + "/" +  b + " - " + c + "/" + d + " = " + num + "/" + denom);
    }
    public static void multiplyRational(int a,int b,int c,int d){
        int  num = Math.abs( a * c);
        int denom =Math.abs( b * d);
        int g = gcd(num,denom);
        num = num /g;
        denom = denom /g;
        System.out.println("Multiplication of Fraction: " + a + "/" +  b + " * " + c + "/" + d + " = " +num + "/" + denom);
    }
    public static void divideRational(int a,int b,int c,int d){
        int  num = Math.abs( a * d);
        int denom =Math.abs( b * c);
        int g = gcd(num,denom);
        num = num /g;
        denom = denom /g;
        System.out.println("Division of Fraction: " + a + "/" +  b + " / " + c + "/" + d + " = " +num + "/" + denom);
    }
}
