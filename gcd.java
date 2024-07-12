public class gcd {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 24;
        int gcd = (num1 < num2) ? num1 : num2;
        while(gcd > 0){
            if(num1 % gcd == 0 && num2 % gcd == 0){
                System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
                break;
            }
            gcd--;
        }
    }
}
