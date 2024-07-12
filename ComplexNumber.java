public class ComplexNumber {
        int real, img;
        ComplexNumber(int real, int img){
            this.real = real;
            this.img = img;
        }
        void display(){
            System.out.println(real + " + " + img + "i");
        }
        void add(ComplexNumber c){
            System.out.println((real + c.real) + " + " + (img + c.img) + "i");
        }   
        public static void main(String[] args) {
            ComplexNumber c1 = new ComplexNumber(5, 3);
            ComplexNumber c2 = new ComplexNumber(4, 5);
            c1.display();
            c2.display();
            c1.add(c2);
        }
}
