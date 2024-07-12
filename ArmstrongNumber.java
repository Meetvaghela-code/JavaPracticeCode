public class ArmstrongNumber {
    static boolean isArmstrong(int n){
        int OriginalNum = n;
        int sum = 0;
        int length = String.valueOf(OriginalNum).length();

        while(OriginalNum != 0){
            int digit = OriginalNum % 10;
            sum += Math.pow(digit, length);
            OriginalNum/= 10;
        }

        return sum == n ;   

    }
    public static void main(String[] args) {
        int num = 153;

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
