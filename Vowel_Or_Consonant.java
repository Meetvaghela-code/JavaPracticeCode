public class Vowel_Or_Consonant{

    static void isVovelorConsonant(char str){

        if(str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u'){
            System.out.println(str + " is a vovel");
        }
        else{
            System.out.println(str + " is a consonant");
        }

    }

    public static void main(String[] args) {

        char string = 'y';
        isVovelorConsonant(string);
    }
}