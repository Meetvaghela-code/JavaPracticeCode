public class largestNumber {
    public static void main(String[] args) {
        int[] num = {10, 20, 30};
        int max = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("The largest number is " + max);
    }
}
