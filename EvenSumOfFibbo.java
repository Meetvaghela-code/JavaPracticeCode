public class EvenSumOfFibbo {

    static int fibbo(int n) {
        if (n <= 0) {
            return 0;
        }

        int a = 0, b = 1, sum = 0;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;

            if (c % 2 == 0) {
                sum += c;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 10;

        System.out.println("The sum of even Fibonacci numbers 0 to " + num + " is " + fibbo(num));
    }
}
