public class Complex {
    private double re; // вещественная часть
    private double im; //мнимая часть


    Complex(double re, double im) {
        this.re = re; // this.re указывает на приватное свойство private double re;
        this.im = im;
    }

    public static Complex sum(Complex c1, Complex c2) { // static чтобы не создавать новое комплексное число
        return new Complex(c1.re + c2.re, c1.im + c2.im);
    }

    public static Complex sub(Complex c1, Complex c2) { // вычитание
        return new Complex(c1.re - c2.re, c1.im - c2.im);
    }

    public static Complex mult(Complex c1, Complex c2) { // умножение
        return new Complex(c1.re * c2.re - c1.im * c2.im, c1.re * c2.im + c1.im * c2.re);
    }

    public static Complex div(Complex c1, Complex c2) { // деление
        Complex chisl = Complex.mult(c1, c2.sopr()); // считаем числитель
        double znam = Complex.mult(c2, c2.sopr()).re; // для double re обязателен // считаем знаменатель
        return new Complex(chisl.re / znam, chisl.im / znam);
    }

    public Complex sopr() { // возвращение сопряженного
        return new Complex(this.re, - this.im);
    }

    public static boolean equals(Complex c1, Complex c2) { // сравнение
        double rc1 = Math.sqrt(Math.pow(c1.re, 2) + Math.pow(c1.im, 2));
        double rc2 = Math.sqrt(Math.pow(c2.re, 2) + Math.pow(c2.im, 2));
        return rc1 == rc2;

    }

    @Override
    public String toString() {
        return im >= 0 ? re + "+" + im + "i" : re + "" + im + "i";

    }
}
