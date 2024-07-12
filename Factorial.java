public class Factorial {
    
    static int isFacto(int n){

        int sum = 1;
        int i = 1;

        while (n>i) {
            sum*=n;
            n--;
        }
        return sum;

    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println(num+"! ="+" "+ isFacto(num));
    }
}
