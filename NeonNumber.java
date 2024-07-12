import java.util.*;
public class NeonNumber {
    static boolean isNeon(int n){
        int sqr = (int) Math.pow(n,2);
        int Number = sqr;
        int sum = 0;
        while (Number != 0) {
            int digit = Number % 10;
            sum += digit;
            Number/=10;

        }
        return sum == n;
    }

    public static void main(String[] args) {
        int num = 9;

        if (isNeon(num)) {
            System.out.println(num + "is Neon number");
        }
        else{
            System.out.println(num+"is not Neon number");
        }
        
    }
}
