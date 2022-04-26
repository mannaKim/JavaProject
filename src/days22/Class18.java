package days22;

class Complex {
    //복소수 5+3i -> i:루트-1
    int real;
    int image;

    void prn() {
        System.out.println(real+"+"+image+"i");
    }
    public Complex(){ }
    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }
    public Complex add(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real+c.real;
        temp.image = this.image+c.image;
        return temp;
    }
    public Complex subtract(Complex c) {
        Complex temp = new Complex();
        temp.real = this.real-c.real;
        temp.image = this.image-c.image;
        return temp;
    }
}

public class Class18 {
    public static void main(String[] args) {
        Complex c1 = new Complex(5,8);
        Complex c2 = new Complex(4,9);

        c1.prn();
        c2.prn();
        System.out.println();

        Complex c3 = new Complex();
        c3=c1.add(c2);
        c1.prn();
        c2.prn();
        c3.prn();
        System.out.println();

        c3=c1.subtract(c2);
        c1.prn();
        c2.prn();
        c3.prn();
    }
}
