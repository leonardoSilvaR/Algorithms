public class Euclidean {

    public int gcd(int dividend, int divisor) {
        int dividendAux = divisor;
        int remainder = dividend % divisor;
        while (remainder != 0) {
            remainder = dividendAux % remainder;
            dividendAux = remainder;
        }
        return 0;
    }

    public static void main(String[] args) {
        Euclidean euclidean = new Euclidean();
        System.out.println(euclidean.gcd(106, 16));
    }
}
