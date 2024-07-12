public class hcf {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 25;
        int hcf = (num1 < num2) ? num1 : num2;
        while(hcf > 0){
            if(num1 % hcf == 0 && num2 % hcf == 0){
                System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
                break;
            }
            hcf--;
        }

    }
}
