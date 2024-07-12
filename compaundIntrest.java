public class compaundIntrest {
    public static void main(String[] args) {
        float p,n,r;
        p = 1200;
        n = 2;
        r = 5.4f;
        float div = r / 100;
        float Compount_intrest = p * (float) Math.pow(1+div, n);

        System.out.println("the compound intrest is ="+" "+Compount_intrest);
    }
}
