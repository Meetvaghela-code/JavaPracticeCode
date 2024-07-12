class AddTwoBinaryStrings{
    public static void main(String[] args) {
        String num1 = "1011";
        String num2 = "1111";


        
        int intNum1 = stringToInt(num1);
        int intNum2 = stringToInt(num2);

        int result = intNum1+intNum2;

        String binaryNum = intToBinary(result);
        System.out.println("Binary sum is = "+binaryNum);
    }

    public static int intToInt(int num){
        int result = 0;

        if(num==0){
            return 0;
        }
        while (num>0) {
            int remainder = num%2;
            result += Math.pow(2, remainder); 
            num/=10;
        }

        return result;
    }

    public static int stringToInt(String num){
        int result =0;
        int length = num.length();
        for(int i=0;i<length;i++){
            char c = num.charAt(length-1-i);
            if(c=='1'){
                result+= Math.pow(2,i);
            }else if(c!='0'){
                throw new IllegalArgumentException("Invalid binary string");
            }
        }

        return result;
    }

    public static String intToBinary(int num){
        if (num == 0) {
            return "0";
        }
        int tempNumber = num;
        int numBits=0;
        while(tempNumber>0){
            numBits++;
            tempNumber/=2;
        }

        char Binary[] = new char[numBits];
        int index =numBits-1;
        while(num>0){
            int remainder = num%2;
            Binary[index--] = (char) (remainder+'0');
            num/=2;
        }

        return new String(Binary);
    }
}