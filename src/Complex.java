public class Complex {
    private double re; // вещественная часть
    private double im; //мнимая часть


    Complex(double re, double im) {
        this.re = re; // this.re указывает на приватное свойство private double re;
        this.im = im;
    }

    public static Complex sum(Complex c1, Complex c2) { // static чтобы не создавать
        return new Complex(c1.re + c2.re, c1.im + c2.im);
    }

    @Override
    public String toString() {
        return im >= 0 ? re + "+" + im + "i" : re + im + "i";

    }
}
